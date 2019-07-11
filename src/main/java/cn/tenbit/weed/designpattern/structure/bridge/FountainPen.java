package cn.tenbit.weed.designpattern.structure.bridge;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 13:36
 */
public class FountainPen extends AbstractPen implements Pen {

    @Override
    public String getDescription() {
        return "fountain pen";
    }
}
