import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyThread implements Callable<String> {
    private String value;
    private MyThread next;
    private Integer index;

    @Override
    public String call() throws Exception {
        if (this.next != null) {
            this.next.setIndex(this.index);
            //开启下一个线程
            FutureTask<String> future = new FutureTask<>(this.next);
            new Thread(future).start();
            String nextString = future.get();
            return value.charAt(this.index) + nextString;
        }
        return String.valueOf(value.charAt(this.index));
    }

    public MyThread(String value, MyThread next) {
        this.value = value;
        this.next = next;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}