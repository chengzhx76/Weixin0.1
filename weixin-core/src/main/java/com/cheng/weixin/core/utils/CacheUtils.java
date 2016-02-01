package com.cheng.weixin.core.utils;

import net.sf.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desc: 缓存工具类
 * Author: Cheng
 * Date: 2016/2/1 0001
 */
public class CacheUtils {
    @Autowired
    private static CacheManager cacheManager;

}
