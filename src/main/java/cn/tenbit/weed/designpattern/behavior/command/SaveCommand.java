package cn.tenbit.weed.designpattern.behavior.command;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 17:07
 */
public class SaveCommand extends AbstractCommand implements Command {

    public SaveCommand() {
        setRecevier(new SaveReceiver());
    }

    @Override
    public void execute() {
        getRecevier().action();
    }
}
