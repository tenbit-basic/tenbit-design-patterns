package cn.tenbit.weed.designpattern.structure.composite;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-17 14:10
 */

public class CompositeTest {

    @Test
    public void test() {
        Box box1 = new Box("box1");

        box1.addItem(new Item("item1"));
        box1.addItem(new Item("item2"));
        box1.addItem(new Item("item3"));

        Box box2 = new Box("box2");
        box2.addItem(new Item("item4"));

        box1.addItem(box2);

        HarePrintUtils.prettyJsonConsole(box1);
    }
}
