package com.ours.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ours.dao.FmsBizCaseInfoMapper;
import com.ours.dao.FmsBizCustInfoMapper;
import com.ours.dao.SysUserMapper;
import com.ours.entity.FmsBizCaseInfo;
import com.ours.entity.FmsBizCustInfo;
import com.ours.entity.SysUser;
import com.ours.service.FmsBizCustInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 客户信息表 服务实现类
 * </p>
 *
 * @author liushuai
 * @since 2019-05-23
 */
@Service
public class FmsBizCustInfoServiceImpl extends ServiceImpl<FmsBizCustInfoMapper, FmsBizCustInfo> implements FmsBizCustInfoService {
    @Autowired
    private FmsBizCustInfoMapper fmsBizCustInfoMapper;
    @Autowired
    private FmsBizCaseInfoMapper fmsBizCaseInfoMapper;
    @Autowired
    private SysUserMapper sysUserMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addCustInfoAndCaseInfo(FmsBizCaseInfo fmsBizCaseInfo, FmsBizCustInfo fmsBizCustInfo) {
        boolean flag = false;
        Integer rows1 = fmsBizCaseInfoMapper.insert(fmsBizCaseInfo);
        Integer rows2 = fmsBizCustInfoMapper.insert(fmsBizCustInfo);
        flag = rows1.equals(1) && rows2.equals(1);
        if (!flag) {
            throw new RuntimeException("添加失败");
        }
        return flag;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addCustInfoAndUserInfo(FmsBizCustInfo fmsBizCustInfo, SysUser user) {
        boolean flag;
        Integer rows1 = sysUserMapper.insert(user);
        fmsBizCustInfo.setUid(user.getUid());
        Integer rows2 = fmsBizCustInfoMapper.insert(fmsBizCustInfo);
        flag = rows1.equals(1) && rows2.equals(1);
        if (!flag) {
            throw new RuntimeException("添加失败");
        }
        return flag;
    }
}
