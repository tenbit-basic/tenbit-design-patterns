package cn.tenbit.weed.designpattern.behavior.visitor;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 16:05
 */
public interface Company<T extends Material> {

    String create(T material);
}
