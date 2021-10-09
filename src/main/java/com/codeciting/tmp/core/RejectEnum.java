package com.codeciting.tmp.core;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhiyuan.wang
 * @date 2021/10/9 8:56 下午
 */
public enum RejectEnum {

    DiscardOldestPolicy("discardOldest"),
    DiscardPolicy("discard"),
    AbortPolicy("abort"),
    CallerRunsPolicy("callerRuns");

    String name;

    RejectEnum(String name){
        this.name = name;
    }

}
