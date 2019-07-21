package cn.tenbit.weed.designpattern.behavior.mediator;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 17:01
 */
public class SimpleCustomer implements Customer {

    @Getter
    @Setter
    private Mediator mediator;

    @Override
    public void send(Message message) {
        getMediator().relay(message);
    }

    @Override
    public void recv(Message message) {
        HarePrintUtils.console("recved");
    }
}
