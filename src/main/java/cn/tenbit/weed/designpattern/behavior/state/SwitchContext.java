package cn.tenbit.weed.designpattern.behavior.state;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:37
 */
public class SwitchContext {

    private final AtomicReference<SwitchState> state = new AtomicReference<>();

    public SwitchState getState() {
        return state.get();
    }

    public void setState(SwitchState state) {
        this.state.getAndSet(state);
    }
}
