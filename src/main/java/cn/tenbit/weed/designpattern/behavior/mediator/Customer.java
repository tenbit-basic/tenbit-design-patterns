package cn.tenbit.weed.designpattern.behavior.mediator;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 17:00
 */
public interface Customer {

    void send(Message message);

    void recv(Message message);
}
