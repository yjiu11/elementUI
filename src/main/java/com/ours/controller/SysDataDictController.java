package com.ours.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ours.base.common.Const;
import com.ours.base.common.ServiceMessage;
import com.ours.entity.SysDataDict;
import com.ours.service.SysDataDictService;
import com.ours.vo.SysDataDictVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lyf on 2019/5/27.
 */
@RestController
@RequestMapping("/dict")
public class SysDataDictController {

    @Autowired
    private SysDataDictService sysDataDictService;

    @PostMapping("/listByKey")
    public ServiceMessage listByKey(@RequestBody String body){
        ServiceMessage result = new ServiceMessage();

        JSONObject json = JSON.parseObject(body);
        String key = json.getString("dictKey");
        if(StringUtils.isBlank(key)){
            return result.buildFail();
        }
        Wrapper<SysDataDict> queryParams = new EntityWrapper<>();
        queryParams.eq("data_val",key);
        queryParams.eq("valid","1");
        queryParams.orderBy("orderby",true);
        List<SysDataDict> list = sysDataDictService.selectList(queryParams);
        List<SysDataDictVo> voList = new ArrayList<>();
        voList = list.stream().map(SysDataDict -> new SysDataDictVo(SysDataDict.getDictCode(),SysDataDict.getDictName(),SysDataDict.getDataVal(),SysDataDict.getDataTrsVal())).collect(Collectors.toList());
        result.put(Const.DATA_KEY, voList);
        result.put("succ", true);
        return result;
    }
}
