package com.ours.vo;

import lombok.Data;

/**
 * Created by lyf on 2019/5/27.
 */
@Data
public class SysDataDictVo {
//    private String sysCode;
//    private String teamCode;
    private String dictCode;
    private String dictName;
    private String dataVal;
    private String dataTrsVal;
//    private String description;

    public SysDataDictVo(String dictCode,String dictName,String dataVal,String dataTrsVal) {
        this.dictCode = dictCode;
        this.dictName = dictName;
        this.dataVal = dataVal;
        this.dataTrsVal = dataTrsVal;
    }
}
