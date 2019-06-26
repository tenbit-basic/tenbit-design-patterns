package cn.tenbit.weed.designpattern.creation.singleton.unsafe;

import cn.tenbit.weed.designpattern.creation.singleton.Singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:50
 */
public class UnsafeLazySingleton2 implements Singleton {

    private static volatile UnsafeLazySingleton2 INSTANCE;

    private UnsafeLazySingleton2() {
    }

    public static UnsafeLazySingleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnsafeLazySingleton2();
        }
        return INSTANCE;
    }
}
