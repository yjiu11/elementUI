package com.ours.service;

import com.ours.entity.SysUser;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

public interface SysUserService extends IService<SysUser> {

    Page<SysUser> queryUserIncludeRoles(Page page, String nick);
    
    Map<String, Object> queryBranchByUser(String uname);

}
