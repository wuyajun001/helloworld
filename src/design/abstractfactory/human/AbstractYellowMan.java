package design.abstractfactory.human;

/**
 * description:<黄色人种抽象类>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/13 17:26
 */
public class AbstractYellowMan implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人很高兴,即兴赋诗一首" +
                "白日依山尽,黄河入海流。欲穷千里目,更上一层楼。");
    }

    @Override
    public void talk() {
        System.out.println("黄种人使用汉语交流,这是世界上使用人数最多的语言...");
    }

    @Override
    public void cry() {
        System.out.println("哭泣也是黄种人表达情绪的方式之一...");
    }
}
