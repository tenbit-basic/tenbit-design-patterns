package cn.tenbit.weed.designpattern.behavior.singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:33
 */
public class InnerSingleton implements Singleton{

    private static class Instance {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return Instance.INSTANCE;
    }
}
