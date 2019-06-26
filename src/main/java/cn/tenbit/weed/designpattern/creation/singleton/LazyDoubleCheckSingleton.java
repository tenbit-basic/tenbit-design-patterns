package cn.tenbit.weed.designpattern.creation.singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:14
 */
public class LazyDoubleCheckSingleton implements Singleton {

    private static final Object LOCK = new Object();

    private static volatile LazyDoubleCheckSingleton INSTANCE;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (LOCK) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            INSTANCE = new LazyDoubleCheckSingleton();
            return INSTANCE;
        }
    }
}
