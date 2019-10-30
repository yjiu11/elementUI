package com.ours.service.impl;

import com.ours.dao.SysRolePermMapper;
import com.ours.entity.SysRolePerm;
import com.ours.service.SysRolePermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysRolePermServiceImpl extends ServiceImpl<SysRolePermMapper, SysRolePerm> implements SysRolePermService {
}
