package design.factory;

import design.factory.human.Human;

import java.util.List;
import java.util.Random;

/**
 * description:<人类工厂>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/12 17:44
 */
public class HunManFactory {

    public static Human creatMan(Class clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
            System.out.println("我是女娲娘娘拿手捏出来的人!");
        } catch (Exception e) {
            System.out.println("造人失败, 原因:" + e.getMessage());
        }
        return human;
    }


    public static Human creatMan() {
        Human human = null;
        List<Class> allHuman = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int nextInt = random.nextInt(17 + 1);
        int product = nextInt % allHuman.size();

        try {
            human = (Human) Class.forName(allHuman.get(product).getName()).newInstance();
            System.out.println("我是女娲娘娘拿柳条蘸着泥浆批量制造的人!");
        } catch (Exception e) {
            System.out.println("造人失败, 原因:" + e.getMessage());
        }
        return human;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int nextInt = random.nextInt(16 + 1);
        System.out.println(nextInt);
    }

}
