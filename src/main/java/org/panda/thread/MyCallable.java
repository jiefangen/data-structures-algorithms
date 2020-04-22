package org.panda.thread;

import java.util.concurrent.Callable;

/**
 *
 * @author jvfagan
 * @since JDK 1.8  2020/4/10
 **/
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //返回执行当前 Callable 的线程名字
        return Thread.currentThread().getName();
    }
}
