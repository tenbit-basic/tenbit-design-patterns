package cn.tenbit.weed.designpattern.behavior.state;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:37
 */
public class Switch {

    private final SwitchContext context = new SwitchContext();

    public void on() {
        new OnSwitchState().doAction(context);
    }

    public void off() {
        new OffSwitchState().doAction(context);
    }
}
