package com.ours.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 审批结果表 Mapper 接口
 * </p>
 *
 * @author liushuai
 * @since 2019-06-04
 */
public interface FmsBizApprInfoDao {

    //@Select("select a.case_id caseId,a.cust_no custNo,a.cust_nm custNm,b.appr_amt apprAmt,b.appr_loan_term apprLoanTerm,b.appr_loan_rate apprLoanRate,b.appr_repay_mode apprRepayMode,b.branch_nm,b.create_time createTime,b.update_time updateTime,b.appr_state apprState from fms_biz_case_info a left join fms_biz_appr_info b on a.case_id = b.case_id where a.case_id=#{caseId} order by b.update_time desc limit #{head}, #{pageSize}")

    @Select("<script>" +
            "select " +
            "a.case_id caseId" +
            ",a.cust_no custNo" +
            ",a.cust_nm custNm" +
            ",b.appr_amt apprAmt" +
            ",b.appr_loan_term apprLoanTerm" +
            ",b.appr_loan_rate apprLoanRate" +
            ",b.appr_repay_mode apprRepayMode" +
            ",b.branch_nm" +
            ",b.create_time createTime" +
            ",b.update_time updateTime" +
            ",b.appr_state apprState " +
            "from fms_biz_case_info a left join fms_biz_appr_info b " +
            "on a.case_id = b.case_id " +
            "        <if test='caseId!=null'>" +
            "            where a.case_id=#{caseId}   " +
            "        </if>" +
            "order by b.update_time desc " +
            "limit #{head}, #{pageSize}" +
            "</script>")
    List<Map<String, Object>> queryApprWithCaseInfo(String caseId, Integer head, Integer pageSize);
}
