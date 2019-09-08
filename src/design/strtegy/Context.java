package design.strtegy;

import design.strtegy.strtegyservice.InterfaceStrtegy;

/**
 * description:<策略的容器>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/5 10:32
 */
public class Context {

    private InterfaceStrtegy interfaceStrtegy;

    public Context(InterfaceStrtegy interfaceStrtegy) {
        this.interfaceStrtegy = interfaceStrtegy;
    }

    public void OperactionStrtegy(){
        this.interfaceStrtegy.operate();
    }
}
