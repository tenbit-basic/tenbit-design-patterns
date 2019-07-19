package cn.tenbit.weed.designpattern.behavior.command;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 17:12
 */
public class EditReceiver implements Recevier {

    @Override
    public void action() {
        HarePrintUtils.console("edit");
    }
}
