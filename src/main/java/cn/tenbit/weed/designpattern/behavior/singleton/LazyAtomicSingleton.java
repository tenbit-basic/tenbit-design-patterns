package cn.tenbit.weed.designpattern.behavior.singleton;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:14
 */
public class LazyAtomicSingleton implements Singleton{

    private static final AtomicReference<LazyAtomicSingleton> INSTANCE = new AtomicReference<>();

    private static final Lock LOCK = new ReentrantLock();

    private LazyAtomicSingleton() {
    }

    public static LazyAtomicSingleton getInstance() {
        LazyAtomicSingleton instance = null;
        if ((instance = getInstance0()) != null) {
            return instance;
        }
        try {
            LOCK.lock();
            if ((instance = getInstance0()) != null) {
                return instance;
            }
            instance = new LazyAtomicSingleton();
            INSTANCE.set(instance);
            return instance;
        } finally {
            LOCK.unlock();
        }
    }

    private static LazyAtomicSingleton getInstance0() {
        return INSTANCE.get();
    }
}
