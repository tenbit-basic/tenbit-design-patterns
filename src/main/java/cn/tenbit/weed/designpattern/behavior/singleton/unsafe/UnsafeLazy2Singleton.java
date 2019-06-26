package cn.tenbit.weed.designpattern.behavior.singleton.unsafe;

import cn.tenbit.weed.designpattern.behavior.singleton.Singleton;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:50
 */
public class UnsafeLazy2Singleton implements Singleton {

    private static volatile UnsafeLazy2Singleton INSTANCE;

    private UnsafeLazy2Singleton() {
    }

    public static UnsafeLazy2Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnsafeLazy2Singleton();
        }
        return INSTANCE;
    }
}
