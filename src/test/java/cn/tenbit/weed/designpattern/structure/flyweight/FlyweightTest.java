package cn.tenbit.weed.designpattern.structure.flyweight;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 12:37
 */
public class FlyweightTest {

    @Test
    public void test() {
        CircleBox box = CircleBox.of()
                .add(CircleBox.RED)
                .add(CircleBox.BLUE)
                .add(CircleBox.YELLOW)
                .add(CircleBox.RED)
                .add(CircleBox.YELLOW)
                .add(CircleBox.BLUE);

        box.show();
    }
}
