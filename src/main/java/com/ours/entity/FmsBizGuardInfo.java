package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 担保公司信息表
 * </p>
 *
 * @author liushuai
 * @since 2019-05-31
 */
@Data
public class FmsBizGuardInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 银行编号
     */
    @TableId(type = IdType.INPUT)
    private String guardNo;
    /**
     * 银行名称
     */
    private String guardNm;
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
    private Date createTime;
    private Date updateTime = new Date();


}
