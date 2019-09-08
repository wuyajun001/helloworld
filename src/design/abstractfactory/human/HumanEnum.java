package design.abstractfactory.human;

/**
 * description:<人种枚举>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/13 17:37
 */
public enum HumanEnum {
    /**黄种人*/
    MALE_YELLOWMAN(design.abstractfactory.human.MaleYellowMan.class),
    FEMALE_YELLOWMAN(design.abstractfactory.human.FemaleYellowMan.class);

    /**人种*/
    private Class clazz;

    HumanEnum(Class clazz) {
        this.clazz = clazz;
    }
}
