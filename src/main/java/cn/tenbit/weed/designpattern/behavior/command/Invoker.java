package cn.tenbit.weed.designpattern.behavior.command;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 16:59
 */
public interface Invoker {

    void command(Command command);

    void call();
}
