package com.ours.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ours.base.common.Const;
import com.ours.base.common.ServiceMessage;
import com.ours.entity.TestVue;
import com.ours.service.TestVueService;

/**
 * <p>
 *  客户黑名单表  前端控制器
 * </p>
 *
 * @author liushuai
 * @since 2019-06-17
 */
@RestController
@RequestMapping("/vue")
public class TestVueController {
	 @Autowired
	    private TestVueService TestVueService;

	 /**
	  *  新增
	  * @param TestVue
	  * @return
	  */
	    @PostMapping("add")
	    public ServiceMessage add(@RequestBody TestVue TestVue) {
	        ServiceMessage result = new ServiceMessage();
	        Boolean flag = TestVueService.insert(TestVue);
	        if (!flag) {
	            return result.buildFail();
	        }
			result.put(Const.DATA_KEY,TestVue);
	        return result;
	    }

	    /**
	     * 修改
	     * @param TestVue
	     * @return
	     */
	    @PostMapping("update")
	    public ServiceMessage update(@RequestBody TestVue TestVue) {
	        ServiceMessage result = new ServiceMessage();
	        Boolean flag = TestVueService.updateById(TestVue);
	        if (!flag) {
	            return result.buildFail();
	        }
	        return result;
	    }

	    /**
	     * 查询列表
	     * @param params
	     * @return
	     */
	    @PostMapping("queryList")
	    public ServiceMessage queryList(@RequestBody Map<String, Object> params) {
	        ServiceMessage result = new ServiceMessage();

	        Page<TestVue> page = new Page<>();
	        Wrapper<TestVue> wrapper = new EntityWrapper<>();
	        //搜索参数
	        Object username = params.get("username");
	        if(username !=null) wrapper.like("username", username.toString());
	        page.setTotal(TestVueService.selectCount(wrapper));
	        Integer pageNum = 1;
	        Integer pageSize = Const.PAGE_SIZE;
            Object pageNumObj = params.get("current");
            Object pageSizeObj = params.get("size");
	        if (pageNumObj != null) {
	            pageNum = (int) pageNumObj;
	        }
	        if (pageSizeObj != null) {
	            pageSize = (int) pageSizeObj;
	        }
	        page.setCurrent(pageNum);
	        page.setSize(pageSize);
	        wrapper.orderBy("id", false);
	        page = TestVueService.selectPage(page,wrapper);

	        result.put(Const.DATA_KEY, page.getRecords());
	        result.put("succ", true);

	        Map<String, Object> pageMap = new HashMap<>(4);
	        pageMap.put(Const.PAGES,page.getPages());
	        pageMap.put(Const.TOTAL_KEY,page.getTotal());
	        pageMap.put(Const.PAGE_NUM_KEY,pageNum);
	        pageMap.put(Const.PAGE_SIZE_KEY,pageSize);
	        result.put(Const.PAGE_KEY, pageMap);
	        return result;
	    }

	    /**
	     * 删除
	     * @param params
	     * @return
	     */
	    @DeleteMapping("delete")
	    public ServiceMessage delete(@RequestBody Map<String, Integer> params) {
	        ServiceMessage result = new ServiceMessage();
	        TestVueService.deleteById(params.get("id"));
	        result.put("succ", true);
	        return result;
	    }

	    /**
	     * 根据id查询
	     * @return
	     */
	    @PostMapping("queryById")
	    public ServiceMessage queryById(@RequestBody Map<String, String> params) {
	        ServiceMessage result = new ServiceMessage();
	        TestVue dataList = TestVueService.selectById(params.get("id"));
	        if(dataList == null) {
	        	return result.buildFail("查询失败");
	        }
	        result.put(Const.DATA_KEY, dataList);
	        result.put("succ", true);
	        return result;
	    }

}

