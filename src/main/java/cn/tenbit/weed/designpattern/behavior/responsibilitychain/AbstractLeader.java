package cn.tenbit.weed.designpattern.behavior.responsibilitychain;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 09:06
 */
public abstract class AbstractLeader<T> implements Leader<T> {

    private Leader<T> leader;

    @Override
    public void handle(T t) {
        next(t);
    }

    @Override
    public void next(T t) {
        if (leader != null) {
            leader.handle(t);
        }
    }

    @Override
    public Leader<T> setNext(Leader<T> leader) {
        this.leader = leader;
        return leader;
    }
}
