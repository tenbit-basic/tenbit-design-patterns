package cn.tenbit.weed.designpattern.behavior.factory.abxtract;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 14:00
 */
public class Factories {

    public static ShapeFactory newShapeFactory() {
        return new ShapeFactoryImpl();
    }

    public static ColorFactory newColorFactory() {
        return new ColorFactoryImpl();
    }
}
