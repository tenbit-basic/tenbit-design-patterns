package cn.tenbit.weed.designpattern.creation.factory.simple;

import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.weed.designpattern.common.model.shape.*;

/**
 * @Author bangquan.qian
 * @Date 2019-06-25 17:14
 */
public class SimpleShapeFactory {

    public static Shape getShape(ShapeEnums enu) {
        HareAssertUtils.notNull(enu);

        Shape shape = null;
        switch (enu) {
            default:
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            case SQUARE:
                shape = new Square();
                break;
        }
        return shape;
    }
}
