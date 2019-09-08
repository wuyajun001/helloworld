package thread;

public class MyThread implements Runnable {

    private static ThreadPool threadPool = new ThreadPool(10);

    @Override
    public void run() {
        Thread thread1 = Thread.currentThread();
        try {
            for (int i = 0; i < 3; i++) {
                Thread thread = threadPool.takeThread(10);
                System.out.println(thread1.getName() + " " + thread.getName());
                // 将线程归还给线程池
                threadPool.returnThread(thread);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
