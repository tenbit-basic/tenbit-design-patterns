package cn.tenbit.weed.designpattern.behavior.factory.abxtract;

import cn.tenbit.weed.designpattern.common.model.color.Color;
import cn.tenbit.weed.designpattern.common.model.color.ColorEnums;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 13:53
 */
public interface ColorFactory {

    Color getColor(ColorEnums enu);
}
