package cn.tenbit.weed.designpattern.behavior.observer;

import cn.tenbit.hare.core.lite.observer.HareObservable;
import cn.tenbit.hare.core.lite.observer.HareObserver;
import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:26
 */
public class Boy implements HareObserver<Boy> {

    @Override
    public void update(HareObservable observable, Object arg) {
        HarePrintUtils.console("boy received, " + arg);
    }

    @Override
    public int compareTo(Boy o) {
        HareAssertUtils.notNull(o);
        return this.hashCode() - o.hashCode();
    }
}
