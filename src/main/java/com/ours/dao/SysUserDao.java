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
public interface SysUserDao {

    @Select("select u.uname,u.branch_no,b.branch_name from sys_user u join sys_branch b on u.branch_no = b.branch_no where u.uname=#{uname}")
    Map<String, Object> queryBranchByUser(String uname);
}
