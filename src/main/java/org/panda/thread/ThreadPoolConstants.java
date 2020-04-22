package org.panda.thread;

/**
 * @author jvfagan
 * @since JDK 1.8  2020/4/10
 **/
public class ThreadPoolConstants {
    // 核心线程数线程数定义了最小可以同时运行的线程数量。
    public static final int CORE_POOL_SIZE = 5;
    // 当队列中存放的任务达到队列容量的时候，当前可以同时运行的线程数量变为最大线程数。
    public static final int MAX_POOL_SIZE = 10;
    // 当新任务来的时候会先判断当前运行的线程数量是否达到核心线程数，如果达到的话，新任务就会被存放在队列中。
    public static final int QUEUE_CAPACITY = 100;
    // 当线程池中的线程数量大于 corePoolSize 的时候，如果这时没有新的任务提交，核心线程外的线程不会立即销毁，
    // 而是会等待，直到等待的时间超过了 keepAliveTime才会被回收销毁。
    public static final Long KEEP_ALIVE_TIME = 1L;
    private ThreadPoolConstants(){
    }
}
