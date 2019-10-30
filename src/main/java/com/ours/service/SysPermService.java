package com.ours.service;

import com.ours.entity.SysPerm;
import com.ours.vo.AuthVo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Set;

public interface SysPermService extends IService<SysPerm> {

    Set<AuthVo> getPermsByUserId(String userId);

    List<SysPerm> getPermsByRoleId(String roleId);

    void saveOrUpdate(List<SysPerm> perms);



}
