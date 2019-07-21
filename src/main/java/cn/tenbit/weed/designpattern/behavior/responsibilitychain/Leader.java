package cn.tenbit.weed.designpattern.behavior.responsibilitychain;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 09:05
 */
public interface Leader<T> {

    void handle(T t);

    void next(T t);

    Leader<T> setNext(Leader<T> leader);
}
