package design.proxy;

import design.proxy.proxyservice.EntertainmentCircle;
import design.proxy.proxyservice.LiuYiFei;

/**
 * description:<经纪人>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/6 10:02
 */
public class Broker implements EntertainmentCircle {

    private EntertainmentCircle entertainmentCircle;

    /**
     * description:<默认演艺人是神仙姐姐>
     *
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/8/6 10:04
     */
    public Broker() {
        this.entertainmentCircle = new LiuYiFei();
    }

    /**
     * description:<指定演艺人>
     *
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/8/6 10:04
     */
    public Broker(EntertainmentCircle entertainmentCircle) {
        this.entertainmentCircle = entertainmentCircle;
    }

    /**
     * description:<经纪人不执行唱歌动作,所以会交给演艺人来做>
     *
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/8/6 10:04
     */
    @Override
    public void song() {
        this.entertainmentCircle.song();
    }

    /**
     * description:<经纪人不执行跳舞动作,所以会交给演艺人来做>
     *
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/8/6 10:04
     */
    @Override
    public void dence() {
        this.entertainmentCircle.dence();
    }
}
