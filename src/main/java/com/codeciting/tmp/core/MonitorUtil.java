package com.codeciting.tmp.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhiyuan.wang
 * @date 2021/10/9 4:06 下午
 */
public class MonitorUtil {

    private static Map<String, ThreadPoolExecutor> threadPoolMap = new HashMap<>();

    public static boolean setThreadPool(String name, ThreadPoolExecutor executor) {
        if (notContains(name)) {
            return false;
        }
        threadPoolMap.put(name, executor);
        return true;
    }

    public static boolean setMaximumPoolSize(String name, int maximumPoolSize) {
        if (notContains(name)) {
            return false;
        }
        get(name).setMaximumPoolSize(maximumPoolSize);
        return true;
    }

    public static boolean setCorePoolSize(String name, int corePoolSize) {
        if (notContains(name)) {
            return false;
        }
        get(name).setCorePoolSize(corePoolSize);
        return true;
    }

    public static boolean setRejectHandlerPlo(String name, String rejectedExecutionHandlerName) {
        if (notContains(name)) {
            return false;
        }
//        get(name).setRejectedExecutionHandler();
        //todo
        return true;
    }


    private static boolean notContains(String name) {
        return !threadPoolMap.containsKey(name);
    }

    private static ThreadPoolExecutor get(String name) {
        return threadPoolMap.get(name);
    }
}
