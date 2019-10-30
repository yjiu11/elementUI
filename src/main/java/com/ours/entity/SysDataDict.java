package com.ours.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by lyf on 2019/5/26 14:55<br>
 */
@Data
@TableName("sys_data_dictionary")
public class SysDataDict implements Serializable {
    @TableId(type = IdType.ID_WORKER_STR)
    private String id;// 字典id
    private String sysCode;// 系统号
    private String sysName;// 系统名
    private String teamCode;//组码
    private String teamName;//组名
    private String dictCode;//字典码
    private String dictName;//字典名
    private String dataVal;//字典key
    private String dataTrsVal;//字典value
    private String description;//描述
    private String orderby;// 顺序号
    private String versionNum;//
    private Boolean valid;//是否有效

}
