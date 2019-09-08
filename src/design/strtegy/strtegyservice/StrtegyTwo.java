package design.strtegy.strtegyservice;

/**
 * description:<第二种策略的实现>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/5 10:30
 */
public class StrtegyTwo implements InterfaceStrtegy {

    @Override
    public void operate() {
        System.out.println("I'm design.strtegy one!");
    }

}
