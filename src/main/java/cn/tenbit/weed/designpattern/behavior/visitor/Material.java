package cn.tenbit.weed.designpattern.behavior.visitor;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 16:04
 */
public interface Material {

    String accept(Company<? extends Material> visitor);
}
