package com.cheng.weixin.core.entity;

import com.cheng.weixin.core.entity.enums.Status;
import com.cheng.weixin.core.utils.IdGen;

import java.util.Date;

/**
 * Desc: 数据Entity类
 * Author: 光灿
 * Date: 2016/2/27
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

    /** 备注 **/
    protected String remarks;
    /** 创建者 **/
    protected Admin createBy;
    /** 更新者 **/
    protected Admin updateBy;
    /** 创建时间 **/
    protected Date createDate;
    /** 更新时间 **/
    protected Date updateDate;
    /** 状态 **/
    protected Status status;

    public DataEntity() {
        this.status = Status.NORMAL;
    }

    @Override
    protected void preUpdate() {
        if (this.getIsNewRecord()) {
            super.setId(IdGen.uuid());
        }
        //Admin admin =
        //this.createDate = new Date();
        //this
    }

    @Override
    protected void preInsert() {

    }

    public String getRemarks() {
        return remarks;
    }

    public Admin getCreateBy() {
        return createBy;
    }

    public DataEntity setCreateBy(Admin createBy) {
        this.createBy = createBy;
        return this;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
