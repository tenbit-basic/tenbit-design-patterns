package cn.tenbit.weed.designpattern.creation.singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:32
 */
public enum EnumSingleton implements Singleton{

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
