package com.ours.service;

import com.baomidou.mybatisplus.service.IService;
import com.ours.entity.SysBranch;
import com.ours.vo.SysBranchTree;

import java.util.List;

/**
 * Created by lyf on 2019/5/30.
 */
public interface SysBranchService extends IService<SysBranch> {
    List<SysBranchTree> getTreeList(String branchId);
}
