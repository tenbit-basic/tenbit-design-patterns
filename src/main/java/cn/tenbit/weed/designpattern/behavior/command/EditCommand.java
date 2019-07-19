package cn.tenbit.weed.designpattern.behavior.command;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 17:07
 */
public class EditCommand extends AbstractCommand implements Command {

    public EditCommand() {
        setRecevier(new EditReceiver());
    }

    @Override
    public void execute() {
        getRecevier().action();
    }
}
