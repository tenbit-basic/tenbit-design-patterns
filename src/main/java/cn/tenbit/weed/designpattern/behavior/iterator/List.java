package cn.tenbit.weed.designpattern.behavior.iterator;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 13:41
 */
public interface List<T> {

    void add(T t);

    Iterable<T> iterator();
}
