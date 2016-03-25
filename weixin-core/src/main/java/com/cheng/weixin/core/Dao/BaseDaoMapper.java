package com.cheng.weixin.core.dao;

import java.util.List;

/**
 * Desc: Dao基类
 * Author: Cheng
 * Date: 2016/1/28 0028
 */
public interface BaseDaoMapper<T> {
    /**
     * 获取单条数据
     * @param id
     * @return
     */
    T load(int id);
    /**
     * 获取所有的数据
     * @return
     */
    List<T> loadAll();
    /**
     * 保存实体
     * @param entity
     * @return
     */
    int save(T entity);
    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据（一般为逻辑删除）
     * @param id
     * @return
     */
    int delete(int id);
}
