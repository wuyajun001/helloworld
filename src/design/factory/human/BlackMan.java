package design.factory.human;

/**
 * description:<黑种人>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/12 17:03
 */
public class BlackMan implements Human {
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
