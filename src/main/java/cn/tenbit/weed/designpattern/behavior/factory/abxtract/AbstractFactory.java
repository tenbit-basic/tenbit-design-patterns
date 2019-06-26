package cn.tenbit.weed.designpattern.behavior.factory.abxtract;

import cn.tenbit.weed.designpattern.common.model.color.Color;
import cn.tenbit.weed.designpattern.common.model.color.ColorEnums;
import cn.tenbit.weed.designpattern.common.model.shape.Shape;
import cn.tenbit.weed.designpattern.common.model.shape.ShapeEnums;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 13:57
 */
public class AbstractFactory implements Factory {

    @Override
    public Color getColor(ColorEnums enu) {
        return null;
    }

    @Override
    public Shape getShape(ShapeEnums enu) {
        return null;
    }
}
