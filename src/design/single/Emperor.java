package design.single;

/**
 * description:<皇帝>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/7 16:36
 */
public class Emperor {

    private static Emperor emperor = null;

    private Emperor() {
        // 禁止访问构造方法构造
    }

    public static synchronized Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("大周女皇武则天!");
    }
}
