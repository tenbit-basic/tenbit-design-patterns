package cn.tenbit.weed.designpattern.behavior.state;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:41
 */
public class OffSwitchState extends AbstractSwitchState implements SwitchState {

    @Override
    public void doAction(SwitchContext context) {
        HarePrintUtils.console("OffSwitchState");
        super.doAction(context);
    }
}
