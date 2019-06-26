package cn.tenbit.weed.designpattern.behavior.factory;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.behavior.factory.simple.SimpleShapeFactory;
import cn.tenbit.weed.designpattern.common.model.shape.Shape;
import cn.tenbit.weed.designpattern.common.model.shape.ShapeEnums;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-25 18:48
 */
public class SimpleFactoryTest {

    @Test
    public void test() {
        Shape shape = SimpleShapeFactory.getShape(ShapeEnums.CIRCLE);
        HarePrintUtils.jsonConsole(shape.getDescription());
    }

}
