package com.cheng.weixin.core.service.impl;

import com.cheng.weixin.core.dao.BaseDaoMapper;
import com.cheng.weixin.core.entity.BaseEntity;
import com.cheng.weixin.core.service.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc: 业务处理基类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
@Service
public abstract class CrudService<D extends BaseDaoMapper<T>, T extends BaseEntity<T>>
        implements ICrudService<D, T> {

    //@Autowired
    //protected D dao;

    public abstract BaseDaoMapper<T> getBaseDao();

    /**
     * 根据ID获取单条数据
     * @param id
     * @return
     */
    @Override
    public T get(int id) {
        return getBaseDao().load(id);
    }

    /**
     * 查找所有的数据
     * @return
     */
    @Override
    public List<T> findAll() {
        return getBaseDao().loadAll();
    }

    /**
     * 更新数据
     * @param entity
     * @return
     */
    @Override
    public int update(T entity) {
        return getBaseDao().update(entity);
    }
    /**
     * 保存对象
     * @param entity
     */
    @Override
    public void add(T entity) {
        getBaseDao().save(entity);
    }

    /**
     * 根据ID删除数据
     * @param id
     * @return
     */
    @Override
    public int delete(int id) {
        return getBaseDao().delete(id);
    }
}
