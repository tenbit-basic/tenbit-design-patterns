package cn.tenbit.weed.designpattern.structure.filter;

/**
 * @Author bangquan.qian
 * @Date 2019-07-11 10:54
 */
public abstract class AbstractCriteria<T> implements Criteria<T> {

    private Criteria<T> next;

    @Override
    public T handle(T o) {
        return next == null ? o : next.handle(o);
    }

    @Override
    public Criteria<T> then(Criteria<T> criteria) {
        this.next = criteria;
        return criteria;
    }
}
