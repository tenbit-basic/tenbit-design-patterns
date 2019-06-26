package cn.tenbit.weed.designpattern.creation.factory;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.creation.factory.abxtract.ColorFactory;
import cn.tenbit.weed.designpattern.creation.factory.abxtract.Factories;
import cn.tenbit.weed.designpattern.creation.factory.abxtract.ShapeFactory;
import cn.tenbit.weed.designpattern.common.model.color.Color;
import cn.tenbit.weed.designpattern.common.model.color.ColorEnums;
import cn.tenbit.weed.designpattern.common.model.shape.Shape;
import cn.tenbit.weed.designpattern.common.model.shape.ShapeEnums;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:00
 */
public class AbstractFactoryTest {

    @Test
    public void test() {
        ColorFactory colorFactory = Factories.newColorFactory();
        Color color = colorFactory.getColor(ColorEnums.RED);
        HarePrintUtils.jsonConsole(color);

        ShapeFactory shapeFactory = Factories.newShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeEnums.SQUARE);
        HarePrintUtils.jsonConsole(shape);
    }
}
