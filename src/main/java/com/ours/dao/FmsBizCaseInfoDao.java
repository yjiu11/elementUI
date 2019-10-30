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
public interface FmsBizCaseInfoDao {

    @Select("select a.*,b.* from fms_biz_case_info a left join fms_biz_image_info b on a.case_id = b.case_id where a.case_id=#{caseId}")
    List<Map<String, Object>> queryCaseInfoWithImgUrl(String caseId);
	
}
