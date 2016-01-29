package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.dao.BaseDaoMapper;
import com.cheng.weixin.core.entity.BaseEntity;
import com.cheng.weixin.core.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Desc: 业务处理基类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public class CrudService<D extends BaseDaoMapper<T>, T extends BaseEntity<T>>
        implements ICrudService<D, T> {

    @Autowired
    protected D dao;

    /**
     * 根据ID获取单条数据
     * @param id
     * @return
     */
    public T get(int id) {
        return dao.load(id);
    }

    /**
     * 查找所有的数据
     * @return
     */
    public List<T> findAll() {
        return dao.loadAll();
    }

    /**
     * 更新数据
     * @param entity
     * @return
     */
    public int update(T entity) {
        return dao.update(entity);
    }
    /**
     * 保存对象
     * @param entity
     */
    public void add(T entity) {
        dao.save(entity);
    }

    /**
     * 根据ID删除数据
     * @param id
     * @return
     */
    public int delete(int id) {
        return dao.delete(id);
    }
}
