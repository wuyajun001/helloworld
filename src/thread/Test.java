package thread;

public class Test {

    public static void main(String[] args) {

        Thread testThread1 = new Thread(new MyThread(), "main-1");
        Thread testThread2 = new Thread(new MyThread(), "main-2");
        testThread1.start();
        testThread2.start();

    }

}
