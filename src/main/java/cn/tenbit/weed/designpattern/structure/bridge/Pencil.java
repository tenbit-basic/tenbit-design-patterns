package cn.tenbit.weed.designpattern.structure.bridge;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 13:36
 */
public class Pencil extends AbstractPen implements Pen {

    @Override
    public String getDescription() {
        return "pencil";
    }
}
