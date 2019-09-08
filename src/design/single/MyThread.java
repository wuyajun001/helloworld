package design.single;

/**
 * description:<TODO>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/9 10:26
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        Emperor instance = Emperor.getInstance();
        System.out.println(instance);
    }

}
