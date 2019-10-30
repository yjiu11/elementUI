package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 客户信息表
 * </p>
 *
 * @author liushuai
 * @since 2019-05-23
 */
@Data
public class FmsBizCustInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    private String sysId;
    /**
     * 客户号
     */
    private String custNo;
    /**
     * 贷款金额
     */
    private String loanAmt;
    /**
     * 现有年销售额
     */
    private String curAnuSales;
    /**
     * 贷款目的
     */
    private String loanPurp;
    /**
     * 纳税级别
     */
    private String taxGrade;
    /**
     * 企业类型
     */
    private String compType;
    /**
     * 所属行业
     */
    private String compIndust;
    /**
     * 公司成立年限
     */
    private String estabYears;
    /**
     * 融资期限
     */
    private String financMaturi;
    /**
     * 可接受最高融资利率
     */
    private String financRateAccept;
    /**
     * 还款来源
     */
    private String repaySource;
    /**
     * 客户电话号码
     */
    private String custPhone;
    /**
     * 客户名
     */
    private String custNm;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 县
     */
    private String county;
    /**
     * 企业联系人电话
     */
    private String compLinkPhone;
    /**
     * 企业联系人姓名
     */
    private String compLinkName;
    /**
     * 资产类型
     */
    private String assetType;
    private String bankCheckFlag;
    private String address;
    private String licUrl;
    private String inviteCode;
    private String compLinkDept;
    private String compLinkPost;
    private String compLinkEmail;
    private String custType;
    /**
     * 对应sys_user表uid
     */
    private String uid;

    /**
     * epass ukeyId
     */
    private String ukeyId;
    /**
     * epass pin密码
     */
    private String ukeyPwd;

    private Date createTime;
    private Date updateTime = new Date();

    /**
     * 省
     */
    @TableField(exist = false)
    private String provinceCode;

    /**
     * 市
     */
    @TableField(exist = false)
    private String cityCode;

    /**
     * 县
     */
    @TableField(exist = false)
    private String countyCode;
    /**
     * 县
     */
    @TableField(exist = false)
    private String userName;
}
