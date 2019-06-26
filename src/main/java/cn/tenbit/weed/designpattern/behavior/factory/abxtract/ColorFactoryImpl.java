package cn.tenbit.weed.designpattern.behavior.factory.abxtract;

import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.weed.designpattern.common.model.color.*;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 13:58
 */
public class ColorFactoryImpl extends AbstractFactory implements ColorFactory {

    @Override
    public Color getColor(ColorEnums enu) {
        HareAssertUtils.notNull(enu);

        Color color = null;
        switch (enu) {
            default:
                break;
            case RED:
                color = new Red();
                break;
            case BLUE:
                color = new Blue();
                break;
            case GREEN:
                color = new Green();
                break;
        }
        return color;
    }
}
