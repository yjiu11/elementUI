package com.ours.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ours.annotation.PermInfo;
import com.ours.base.common.Const;
import com.ours.base.common.ServiceMessage;
import com.ours.entity.SysBranch;
import com.ours.service.SysBranchService;
import com.ours.util.PageUtils;
import com.ours.vo.Json;
import com.ours.vo.SysBranchTree;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * created by lyf at 2019/5/30 22:21<br>
 */

@PermInfo(value = "系统机构模块", pval = "a:sys:接口")
@RestController
@RequestMapping("/sys_branch")
public class SysBranchController {

    private static final Logger log = LoggerFactory.getLogger(SysBranchController.class);
    @Autowired
    private SysBranchService SysBranchService;

    @PermInfo("添加系统机构")
//    @RequiresPermissions("a:sys:branch:add")
    @PostMapping
    public Json add(@RequestBody String body) {

        String oper = "add sys branch";
        log.info("{}, body: {}",oper,body);

        SysBranch sysBranch = JSON.parseObject(body, SysBranch.class);

        if (StringUtils.isEmpty(sysBranch.getBranchName())) {
            return Json.fail(oper, "机构名不能为空");
        }
/*        if (StringUtils.isEmpty(sysBranch.getPBranchId())) {
            return Json.fail(oper, "请选择所属机构");
        }*/

        SysBranch branchDB = SysBranchService.selectOne(new EntityWrapper<SysBranch>().eq("branch_name", sysBranch.getBranchName()));
        if (branchDB != null) {
            return Json.fail(oper, "机构已注册");
        }
        //保存新机构数据
        sysBranch.setCreated(new Date());

        boolean success = SysBranchService.insert(sysBranch);
        return Json.result(oper, success)
                .data("created",sysBranch.getCreated());
    }

    @PermInfo("删除系统机构")
//    @RequiresPermissions("a:sys:branch:del")
    @DeleteMapping
    public Json delete(@RequestBody String body) {
        String oper = "delete branch";
        log.info("{}, body: {}",oper,body);

        JSONObject jsonObj = JSON.parseObject(body);
        String bid = jsonObj.getString("bid");
        if (StringUtils.isEmpty(bid)) {
            return Json.fail(oper, "无法删除机构：参数为空（机构id）");
        }

        //限制：不能删当前登录机构
        SysBranch branch = (SysBranch) SecurityUtils.getSubject().getPrincipal();
        if (StringUtils.equals(bid,branch.getBranchId())){
            return Json.fail(oper, "系统限制：不能删除当前登录账号");
        }

        boolean success = SysBranchService.deleteById(bid);
        SysBranchService.delete(new EntityWrapper<SysBranch>().eq("branch_id",bid));
        return Json.result(oper, success);
    }

    @PermInfo("更新系统机构")
//    @RequiresPermissions("a:sys:branch:update")
    @PatchMapping("/update")
    public Json updatebranch(@RequestBody String body) {
        String oper = "update branch";
        log.info("{}, body: {}",oper,body);

        JSONObject json = JSON.parseObject(body);
        String bid = json.getString("branchId");
        SysBranch sysBranch = JSON.parseObject(body, SysBranch.class);

        if (!bid.isEmpty()){
            boolean addSucc = SysBranchService.update(sysBranch,new EntityWrapper<SysBranch>().eq("branch_id",bid));
            return Json.result(oper, addSucc);
        }
        return Json.succ(oper);
    }

    @PermInfo("查询所有系统机构")
//    @RequiresPermissions("a:sys:branch:list")
    @PostMapping("/query")
    public Json query(@RequestBody String body) {
        String oper = "query branch";
        log.info("{}, body: {}", oper, body);
        JSONObject json = JSON.parseObject(body);
        Page<SysBranch> page = SysBranchService.selectPage(PageUtils.getPageParam(json));
        return Json.succ(oper).data("page", page);
    }

    @PermInfo("查询机构树")
//    @RequiresPermissions("a:sys:branch:treeList")
    @PostMapping("/treeList")
    public ServiceMessage treeList() {
        ServiceMessage result = new ServiceMessage();
        String oper = "query treeList";
        log.info("{}, body: {}", oper, null);
//        SysBranch parant = new SysBranch();
//        parant.setBranchId("1");
//        parant.setBranchName("总公司");
//        parant.setChildList();
        List<SysBranchTree> treeList = SysBranchService.getTreeList("0");
        result.put(Const.DATA_KEY, treeList);
        result.put("succ", true);
        return result;
    }
}
