package design.proxy.proxyservice;

/**
 * description:<萨顶顶>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/6 10:09
 */
public class SaDingDing implements EntertainmentCircle {
    @Override
    public void song() {
        System.out.println("萨顶顶在彪海豚音...");
    }

    @Override
    public void dence() {
        System.out.println("萨顶顶在跳街舞...");
    }
}
