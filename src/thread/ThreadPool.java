package thread;

import java.util.LinkedList;

public class ThreadPool {

    private LinkedList<Thread> pool = new LinkedList<>();


    public ThreadPool(int initSize) {
        if (initSize > 0) {
            // 初始化线程池
            for (int i = 1; i <= initSize; i++) {
                Thread thread = new Thread();
                thread.setName("线程" + i);
                pool.addLast(thread);
            }
        }
    }

    public void returnThread(Thread thread) {
        if (thread != null) {
            synchronized (pool) {
                // 将用完的线程插入到链表的最后
                pool.addLast(thread);
                // 通知其他线程
                pool.notifyAll();
            }
        }
    }

    public Thread takeThread(long mills) throws InterruptedException {

        synchronized (pool) {
            // 完全超时
            if (mills <= 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return pool.removeFirst();
            } else {
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                while (pool.isEmpty() && remaining > 0) {
                    pool.wait(remaining);
                    remaining = future - System.currentTimeMillis();
                }
                Thread thread = null;
                if (!pool.isEmpty()) {
                    thread = pool.removeFirst();
                }
                return thread;
            }
        }
    }

}
