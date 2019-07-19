package cn.tenbit.weed.designpattern.behavior.command;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 17:19
 */
public class NotePadInvoker implements Invoker {

    private Command command;

    @Override
    public void command(Command command) {
        this.command = command;
    }

    @Override
    public void call() {
        command.execute();
    }
}
