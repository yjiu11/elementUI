package com.ours.service.impl;

import com.ours.dao.FmsBizApprInfoDao;
import com.ours.dao.SysUserDao;
import com.ours.dao.SysUserMapper;
import com.ours.entity.SysUser;
import com.ours.service.SysUserService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;
    
    
    @Override
    public Page<SysUser> queryUserIncludeRoles(Page page, String nick) {
        return page.setRecords(baseMapper.selectUserIncludeRoles(page,nick));
    }



    @Override
    public Map<String, Object> queryBranchByUser(String uname) {
        return sysUserDao.queryBranchByUser(uname);
    }
    
    
}
