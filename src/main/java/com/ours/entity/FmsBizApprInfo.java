package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 审批结果表
 * </p>
 *
 * @author liushuai
 * @since 2019-06-04
 */
@Data
public class FmsBizApprInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 案件号
     */
    @TableId(type = IdType.INPUT)
    private String caseId;
    /**
     * 批复金额
     */
    private String apprAmt;
    /**
     * 贷款期数
     */
    private String apprLoanTerm;
    /**
     * 贷款利率
     */
    private String apprLoanRate;
    /**
     * 还款方式
     */
    private String apprRepayMode;
    
    private String branchNm;
    
    /**
     * 审批状态
     */
    private String apprState;
    private Date createTime;
    private Date updateTime = new Date();


}
