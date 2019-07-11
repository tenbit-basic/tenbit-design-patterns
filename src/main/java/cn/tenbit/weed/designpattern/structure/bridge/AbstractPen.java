package cn.tenbit.weed.designpattern.structure.bridge;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.common.model.shape.Shape;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 13:36
 */
public abstract class AbstractPen implements Pen {

    @Override
    public void draw(Shape shape) {
        HarePrintUtils.console(this.getDescription() + " draw " + shape.getDescription());
    }
}
