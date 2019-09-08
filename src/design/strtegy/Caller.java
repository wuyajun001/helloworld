package design.strtegy;

import design.strtegy.strtegyservice.StrtegyOne;

/**
 * description:<策略模式调用者>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/5 10:12
 */
public class Caller {


    public static void main(String[] args) {
        System.out.println("I'm caller!");

        Context context = new Context(new StrtegyOne());
        context.OperactionStrtegy();
    }

}
