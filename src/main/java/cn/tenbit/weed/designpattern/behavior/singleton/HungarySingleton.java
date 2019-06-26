package cn.tenbit.weed.designpattern.behavior.singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:14
 */
public class HungarySingleton implements Singleton{

    private static final HungarySingleton INSTANCE = new HungarySingleton();

    private HungarySingleton() {
    }

    public static HungarySingleton getInstance() {
        return INSTANCE;
    }
}
