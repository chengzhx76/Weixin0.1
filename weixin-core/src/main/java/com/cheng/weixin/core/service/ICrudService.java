package com.cheng.weixin.core.service;

import com.cheng.weixin.core.dao.BaseDaoMapper;
import com.cheng.weixin.core.entity.BaseEntity;

import java.util.List;

/**
 * Desc: 业务处理基类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface ICrudService<D extends BaseDaoMapper<T>,T extends BaseEntity<T>> {
    /**
     * 根据ID获取单条数据
     * @param id
     * @return
     */
    T get(int id);

    /**
     * 查找所有的数据
     * @return
     */
    List<T> findAll();

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);
    /**
     * 保存对象
     * @param entity
     */
    void add(T entity);

    /**
     * 根据ID删除数据
     * @param id
     * @return
     */
    int delete(int id);
}
