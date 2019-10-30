package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 银行信息表
 * </p>
 *
 * @author liushuai
 * @since 2019-05-31
 */
@Data
public class FmsBizBankInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 银行编号
     */
    @TableId(type = IdType.INPUT)
    private String bankNo;
    /**
     * 银行名称
     */
    private String bankNm;
    /**
     * 贷款金额(万元)
     */
    private String loanAmt;
    /**
     * 可接受最高融资利率
     */
    private String financRateAccept;
    /**
     * 贷款目的
     */
    private String loanPurp;
    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;
    /**
     * 融资期限
     */
    private String financMaturi;

    private Date createTime;
    private Date updateTime = new Date();


}
