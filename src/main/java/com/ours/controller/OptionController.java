package com.ours.controller;

import com.ours.annotation.PermInfo;
import com.ours.entity.SysRole;
import com.ours.service.SysRoleService;
import com.ours.vo.Json;
import com.ours.vo.Option;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * created by lyf at 2019/5/17 16:41<br>
 */
@PermInfo(value = "选项模块", pval = "a:option")
@RestController
@RequestMapping("/option")
public class OptionController {

    private static final Logger log = LoggerFactory.getLogger(OptionController.class);

    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("/role")
    public Json listRoleOptions() {
        String oper = "list role options";
        log.info(oper);

        EntityWrapper<SysRole> params = new EntityWrapper<>();
        params.setSqlSelect("rid,rname,rval");

        List<SysRole> list = sysRoleService.selectList(params);
        List<Option> options = list.stream().map(obj -> new Option(obj.getRid(), obj.getRname(),obj.getRval())).collect(Collectors.toList());
        return Json.succ(oper, "options", options);
    }


}
