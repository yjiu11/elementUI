package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author liushuai
 * @since 2019-06-17
 */
@Data
public class FmsCompanyBlacklist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 社会信用代码
     */
    private String orgCreditCode;

    private Date createTime;
    private Date updateTime = new Date();

}
