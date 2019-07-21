package cn.tenbit.weed.designpattern.behavior.mediator;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 16:59
 */
public interface Mediator {

    void register(Customer member);

    void relay(Message message);
}
