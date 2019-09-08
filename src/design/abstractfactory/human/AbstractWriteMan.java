package design.abstractfactory.human;

/**
 * description:<白色人种抽象类>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/13 17:42
 */
public class AbstractWriteMan implements Human {
    @Override
    public void laugh() {
        System.out.println("白人很高兴...");
    }

    @Override
    public void talk() {
        System.out.println("白人用英语交谈...");
    }

    @Override
    public void cry() {
        System.out.println("白人在哭...");
    }
}
