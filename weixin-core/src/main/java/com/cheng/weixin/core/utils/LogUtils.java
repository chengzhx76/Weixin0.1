package com.cheng.weixin.core.utils;

import com.cheng.weixin.core.dao.LogDaoMapper;
import com.cheng.weixin.core.entity.Log;
import com.cheng.weixin.core.entity.enums.LogType;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Desc: 日志工具类
 * Author: Cheng
 * Date: 2016/3/23 0023
 */
public class LogUtils {

    private static LogDaoMapper logDao = SpringContextHolder.getBean(LogDaoMapper.class);
    /**
     * 保存日志
     * @param request
     * @param handler
     * @param ex
     * @param title
     * @param useranem
     */
    public static void saveLog(HttpServletRequest request, Object handler, Exception ex, String title, String useranem) {
        Log log = new Log();
        log.setTitle(title);
        log.setType(ex == null ? LogType.ACCESS : LogType.EXCEPTION);
        log.setRemoteAddr(WXStringUtils.getRemoteAddr(request));
        log.setUserAgent(request.getHeader("user-agent"));
        log.setRequestUri(request.getRequestURI());
        log.setParams(request.getParameterMap());
        log.setMethod(request.getMethod());
        log.setUsername(useranem);
        // 异步保存日志
        new Thread(new SaveLogThread(log, handler, ex)).start();
    }

    public static class SaveLogThread implements Runnable {

        private Log log;
        private Object handler;
        private Exception ex;

        public SaveLogThread(Log log, Object handler, Exception ex) {
            this.log = log;
            this.handler = handler;
            this.ex = ex;
        }

        @Override
        public void run() {
            // 如果有异常，则保存异常信息
            log.setException(Exceptions.getStackTraceToString(ex));
//            if (StringUtils.isBlank(log.getTitle()) && StringUtils.isBlank(log.getException())) {
//                return;
//            }
            if (StringUtils.isBlank(log.getException())) {
                return;
            }
            // 保存日志信息
            log.preInsert();
            logDao.save(log);
        }
    }

}
