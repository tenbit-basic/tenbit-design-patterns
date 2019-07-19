package cn.tenbit.weed.designpattern.structure.proxy;

import cn.tenbit.hare.core.lite.proxy.cglib.HareMethodInterceptor;
import cn.tenbit.hare.core.lite.proxy.jdk.HareDefaultInvocationHandler;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.hare.core.lite.util.HareProxyUtils;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 14:19
 */
public class ProxyTest {

    @Test
    public void test() {
        Printer printer = new SimplePrinter();

        Printer jdkPrinter = HareProxyUtils.jdk(printer);
        jdkPrinter.print("123");

        Printer cglibPrinter = HareProxyUtils.cglib(printer);
        cglibPrinter.print("123");

        Printer simpleCglibPrinter = HareProxyUtils.simpleCglib(printer);
        simpleCglibPrinter.print("123");

        Printer jdkPrinter2 = HareProxyUtils.jdk(Printer.class, new HareDefaultInvocationHandler<Printer>(printer) {
            @Override
            protected Object doInvoke(Object proxy, Method method, Object[] args) throws Throwable {
                HarePrintUtils.console("---start---");
                Object result = super.doInvoke(proxy, method, args);
                HarePrintUtils.console("---end---");
                return result;
            }
        });
        jdkPrinter2.print("123");

        Printer cglibPrinter2 = HareProxyUtils.cglib(printer, new HareMethodInterceptor<Printer>() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                HarePrintUtils.console("---start---");
                Object result = methodProxy.invokeSuper(o, objects);
                HarePrintUtils.console("---end---");
                return result;
            }
        });
        cglibPrinter2.print("123");
    }
}
