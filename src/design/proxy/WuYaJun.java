package design.proxy;

import design.proxy.proxyservice.SaDingDing;

/**
 * description:<武亚军>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/6 10:14
 */
public class WuYaJun {


    public static void main(String[] args) {

        Broker broker = new Broker();
        broker.song();
        broker.dence();

        System.out.println("神仙姐姐累了, 所以换萨顶顶上场!");
        Broker broker1 = new Broker(new SaDingDing());
        broker1.song();
        broker1.dence();

    }


}
