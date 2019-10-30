package com.ours.service;

import com.baomidou.mybatisplus.service.IService;
import com.ours.entity.FmsBizCaseInfo;
import com.ours.entity.FmsBizCustInfo;
import com.ours.entity.SysUser;

/**
 * <p>
 * 客户信息表 服务类
 * </p>
 *
 * @author liushuai
 * @since 2019-05-23
 */
public interface FmsBizCustInfoService extends IService<FmsBizCustInfo> {

    boolean addCustInfoAndCaseInfo(FmsBizCaseInfo fmsBizCaseInfo, FmsBizCustInfo fmsBizCustInfo);

    boolean addCustInfoAndUserInfo(FmsBizCustInfo fmsBizCustInfo, SysUser user);
}
