package com.ours.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ours.dao.SysBranchMapper;
import com.ours.entity.SysBranch;
import com.ours.service.SysBranchService;
import com.ours.vo.SysBranchTree;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lyf on 2019/5/30.
 */
@Service
public class SysBranchImpl extends ServiceImpl<SysBranchMapper, SysBranch> implements SysBranchService {

    public List<SysBranchTree> getTreeList(String branchId){
        return baseMapper.getTreeList(branchId);
    }
}
