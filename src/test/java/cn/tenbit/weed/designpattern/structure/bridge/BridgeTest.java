package cn.tenbit.weed.designpattern.structure.bridge;

import cn.tenbit.weed.designpattern.common.model.shape.Circle;
import cn.tenbit.weed.designpattern.common.model.shape.Square;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 13:39
 */
public class BridgeTest {

    @Test
    public void test() {
        Pen pen = new Pencil();
        pen.draw(new Circle());

        Pen pen2 = new FountainPen();
        pen2.draw(new Square());
    }
}
