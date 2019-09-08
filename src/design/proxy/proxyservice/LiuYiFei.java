package design.proxy.proxyservice;

/**
 * description:<刘亦菲>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/6 10:00
 */
public class LiuYiFei implements EntertainmentCircle {
    @Override
    public void song() {
        System.out.println("神仙姐姐在唱<兰若词>!");
    }

    @Override
    public void dence() {
        System.out.println("神仙姐姐在跳<兰陵王>!");
    }
}
