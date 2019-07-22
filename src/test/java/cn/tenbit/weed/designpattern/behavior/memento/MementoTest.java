package cn.tenbit.weed.designpattern.behavior.memento;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 18:09
 */
public class MementoTest {

    @Test
    public void test() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        HarePrintUtils.console("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        HarePrintUtils.console("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        HarePrintUtils.console("Second saved State: " + originator.getState());
    }
}
