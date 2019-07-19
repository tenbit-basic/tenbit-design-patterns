package cn.tenbit.weed.designpattern.behavior.command;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 17:38
 */
public class CommandTest {

    @Test
    public void test() {
        Invoker invoker = new NotePadInvoker();

        Command editcmd = new EditCommand();
        Command savecmd = new SaveCommand();

        invoker.command(editcmd);
        invoker.call();

        invoker.command(savecmd);
        invoker.call();
    }
}
