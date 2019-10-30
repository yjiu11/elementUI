package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 省市县
 * </p>
 *
 * @author liushuai
 * @since 2019-06-10
 */
@Data
public class SysArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    private String value;
    private String pid;
    private String label;
    @TableField(exist = false)
    private List<SysArea> children;
    private Double showOrder;


}
