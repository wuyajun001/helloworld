package design.factory;

import design.factory.human.Human;
import design.factory.human.YellowMan;

/**
 * description:<TODO>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/13 16:11
 */
public class NvWa {

    public static void main(String[] args) {
        Human yellowMan = HunManFactory.creatMan(YellowMan.class);
        yellowMan.cry();
        yellowMan.laugh();
        yellowMan.talk();

        System.out.println("\n\n" + "--------------------------" + "\n\n");

        Human unKnow = HunManFactory.creatMan();
        unKnow.talk();
        unKnow.laugh();
        unKnow.cry();

    }

}
