package cn.tenbit.weed.designpattern.behavior.observer;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:31
 */
public class ObserverTest {

    @Test
    public void test() {
        Girl girl = new Girl();

        Boy boy1 = new Boy();
        Boy boy2 = new Boy();
        Boy boy3 = new Boy();
        Boy boy4 = new Boy();
        Boy boy5 = new Boy();
        Boy boy6 = new Boy();


        girl.addObserver(boy1);
        girl.addObserver(boy2);
        girl.addObserver(boy3);
        girl.addObserver(boy4);
        girl.addObserver(boy5);
        girl.addObserver(boy6);

        girl.notifyObservers("I Love Boy6");
    }
}
