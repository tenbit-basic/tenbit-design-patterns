package cn.tenbit.weed.designpattern.behavior.iterator;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 15:36
 */
public interface Iterable<T> {

    boolean hasNext();

    T next();
}
