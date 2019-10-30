package com.ours.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by lyf on 2019/5/26 14:55<br>
 */
@Data
public class SysBranchTree {
    private String bid;// 机构id
    private String label;// 机构名称
    private boolean disabled = false;
    private List<SysBranchTree> children;
}
