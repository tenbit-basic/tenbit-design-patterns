package cn.tenbit.weed.designpattern.behavior.singleton.unsafe;

import cn.tenbit.weed.designpattern.behavior.singleton.Singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:50
 */
public class UnsafeLazySingleton implements Singleton {

    private static UnsafeLazySingleton INSTANCE;

    private UnsafeLazySingleton() {
    }

    public static UnsafeLazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnsafeLazySingleton();
        }
        return INSTANCE;
    }
}
