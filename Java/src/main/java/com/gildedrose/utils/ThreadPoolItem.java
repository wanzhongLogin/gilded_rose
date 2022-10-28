package com.gildedrose.utils;

import java.util.concurrent.*;

public class ThreadPoolItem {

    /**
     * 获取cpu的核
     */
    private static final int numberOfThread = Runtime.getRuntime().availableProcessors();

    /**
     * 自定义线程数
     *
     * 这里属于是cpu密集型的,所以线程数 <= 电脑的cpu核最佳
     */
    public static final ThreadPoolExecutor pool = new ThreadPoolExecutor(
        numberOfThread,
        numberOfThread,
        1,
        TimeUnit.MINUTES, new ArrayBlockingQueue<>(10000), new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("thread_pool_item" + thread.getName());
            return thread;
        }
    }, new ThreadPoolExecutor.AbortPolicy());
}
