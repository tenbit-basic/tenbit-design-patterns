package cn.tenbit.weed.designpattern.behavior.state;

import cn.tenbit.hare.core.lite.observer.HareObservable;
import cn.tenbit.hare.core.lite.observer.HareObserver;
import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.hare.core.lite.util.HareSleepUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:37
 */
public class Switch extends HareObservable implements HareObserver<Switch> {

    private final SwitchContext context = new SwitchContext();

    public void on() {
        new OnSwitchState().doAction(context);
    }

    public void off() {
        new OffSwitchState().doAction(context);
    }

    public void auto() {
        addObserver(this);

        while (true) {
            notifyObservers();
            HareSleepUtils.sleepSeconds(1);
        }
    }

    private int mode = 0;

    @Override
    public void update(HareObservable observable, Object arg) {
        mode = (mode + 1) % 2;
        if (mode == 0) {
            on();
        } else if (mode == 1) {
            off();
        }
    }

    @Override
    public int compareTo(Switch o) {
        HareAssertUtils.notNull(o);
        return this.hashCode() - o.hashCode();
    }
}
