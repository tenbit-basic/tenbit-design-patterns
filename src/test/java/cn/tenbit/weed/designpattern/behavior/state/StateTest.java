package cn.tenbit.weed.designpattern.behavior.state;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:48
 */
public class StateTest {

    @Test
    public void test() {
        Switch s = new Switch();
        s.on();
        s.off();

        s.auto();
    }
}
