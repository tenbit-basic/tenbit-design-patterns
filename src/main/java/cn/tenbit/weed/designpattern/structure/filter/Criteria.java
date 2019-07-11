package cn.tenbit.weed.designpattern.structure.filter;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 15:35
 */
public interface Criteria<T> {

    T handle(T t);

    Criteria<T> then(Criteria<T> criteria);

    static <T> Criteria<T> of() {
        return new DefaultCriteria<>();
    }
}
