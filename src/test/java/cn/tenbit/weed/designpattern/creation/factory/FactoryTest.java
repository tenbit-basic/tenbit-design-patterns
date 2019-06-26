package cn.tenbit.weed.designpattern.creation.factory;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.creation.factory.normal.ShapeFactory;
import cn.tenbit.weed.designpattern.common.model.shape.Shape;
import cn.tenbit.weed.designpattern.common.model.shape.ShapeEnums;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-25 19:02
 */
public class FactoryTest {

    @Test
    public void test() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(ShapeEnums.CIRCLE);
        HarePrintUtils.jsonConsole(shape);
    }
}
