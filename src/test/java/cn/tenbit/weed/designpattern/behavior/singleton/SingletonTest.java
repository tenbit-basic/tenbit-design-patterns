package cn.tenbit.weed.designpattern.behavior.singleton;

import cn.tenbit.hare.core.lite.function.HareExecutor;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.behavior.singleton.unsafe.UnsafeLazySingleton2;
import cn.tenbit.weed.designpattern.behavior.singleton.unsafe.UnsafeLazySingleton;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:35
 */
public class SingletonTest {

    @Test
    public void test() {
        test0(() -> {
            Singleton instance = LazyDoubleCheckSingleton.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    @Test
    public void test2() {
        test0(() -> {
            Singleton instance = LazyAtomicSingleton.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    @Test
    public void test3() {
        test0(() -> {
            Singleton instance = InnerSingleton.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    @Test
    public void test4() {
        test0(() -> {
            Singleton instance = HungarySingleton.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    @Test
    public void test5() {
        test0(() -> {
            Singleton instance = EnumSingleton.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    @Test
    public void test6() {
        test0(() -> {
            Singleton instance = UnsafeLazySingleton.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    @Test
    public void test7() {
        test0(() -> {
            Singleton instance = UnsafeLazySingleton2.getInstance();
            HarePrintUtils.console(instance.hashCode());
        });
    }

    private void test0(HareExecutor f) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int idx = 0; idx < 64; idx++) {
            executorService.execute(f::execute);
        }
    }
}
