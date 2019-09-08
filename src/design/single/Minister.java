package design.single;

/**
 * description:<大臣>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/7 16:44
 */
public class Minister {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread1.run();
        myThread.run();
        Emperor instance = Emperor.getInstance();
        System.out.println(instance);
    }

}
