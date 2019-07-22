package cn.tenbit.weed.designpattern.behavior.interpreter;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 18:25
 */
public class InterpreterTest {

    @Test
    public void test() {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}
