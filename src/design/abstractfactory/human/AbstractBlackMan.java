package design.abstractfactory.human;

/**
 * description:<黑色人种抽象类>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/13 17:43
 */
public class AbstractBlackMan implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人很高兴...");
    }

    @Override
    public void talk() {
        System.out.println("黑人用印第安语交谈...");
    }

    @Override
    public void cry() {
        System.out.println("黑人在哭...");
    }
}
