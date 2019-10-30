package com.ours.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ours.entity.SysBranch;
import com.ours.vo.SysBranchTree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lyf on 2019/5/30.
 */
@Mapper
public interface SysBranchMapper extends BaseMapper<SysBranch> {

    List<SysBranchTree> getTreeList(@Param("bid")String bid);
}
