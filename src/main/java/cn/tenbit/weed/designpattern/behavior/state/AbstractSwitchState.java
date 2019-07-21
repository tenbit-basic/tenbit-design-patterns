package cn.tenbit.weed.designpattern.behavior.state;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:45
 */
public abstract class AbstractSwitchState implements SwitchState {

    @Override
    public void doAction(SwitchContext context) {
        context.setState(this);
    }
}
