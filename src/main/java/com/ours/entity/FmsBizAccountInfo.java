package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 账款信息表
 */
@Data
public class FmsBizAccountInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.UUID)
    private String caseId;

    /**
     * 核心企业类型
     */
    private String corecomType;

    /**
     * 核心企业名称
     */
    private String corecomNm;

    /**
     * 核心企业营业执照代码
     */
    private String corecomLicCode;


    /**
     * 核心企业所在区域
     */
    private String corecomCity;


    /**
     * 账款金额
     */
    private Float acctAmt;

    /**
     * 账款描述
     */
    private String acctDesc;

    private Date createTime;

    private Date updateTime = new Date();


}
