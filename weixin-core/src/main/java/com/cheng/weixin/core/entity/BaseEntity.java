package com.cheng.weixin.core.entity;

import com.cheng.weixin.core.entity.enums.Status;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc: 基础类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public abstract class BaseEntity<T> implements Serializable {

    private static final long serialVersionUID = 8560136559317259918L;
    /** 实体编号（唯一标识） **/
    protected int id;
    /** 备注 **/
    protected String remarks;
    /** 创建时间 **/
    protected Date createDate;
    /** 状态 **/
    private Status status;

    public BaseEntity() {
        this.createDate = new Date();
        this.status = Status.NORMAL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
