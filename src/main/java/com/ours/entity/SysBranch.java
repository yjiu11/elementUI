package com.ours.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by lyf on 2019/5/26 14:55<br>
 */
@Data
@TableName("sys_branch")
public class SysBranch extends Model<SysBranch> {
    @TableId(type = IdType.ID_WORKER_STR)
    private String branchId;// 机构id
    private String branchName;// 机构名称
    private String branchNo;// 机构名称
    private String pBranchId;// 父机构id
    private Date created;   // 创建时间
    private Date updated;   // 修改时间
    @Override
    protected Serializable pkVal() {
        return branchId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
}
