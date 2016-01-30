package com.cheng.weixin.core.utils;

/**
 * Desc: 异常工具类
 * Author: Cheng
 * Date: 2016/1/29 0029
 */
public class Exceptions {
    /**
     * 将CheckedException转换成UncheckedException.
     * @param e
     * @return
     */
    public static RuntimeException unchecked(Exception e) {
        if(e instanceof RuntimeException) {
            return (RuntimeException) e;
        }else {
            return new RuntimeException(e);
        }
    }
}
