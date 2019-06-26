package cn.tenbit.weed.designpattern.behavior.factory.abxtract;

import cn.tenbit.weed.designpattern.common.model.shape.Shape;
import cn.tenbit.weed.designpattern.common.model.shape.ShapeEnums;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 13:53
 */
public interface ShapeFactory {

    Shape getShape(ShapeEnums enu);
}
