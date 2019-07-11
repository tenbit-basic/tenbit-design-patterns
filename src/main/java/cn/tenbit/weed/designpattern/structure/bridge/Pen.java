package cn.tenbit.weed.designpattern.structure.bridge;

import cn.tenbit.weed.designpattern.common.model.shape.Shape;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 13:35
 */
public interface Pen {

    void draw(Shape shape);

    String getDescription();
}
