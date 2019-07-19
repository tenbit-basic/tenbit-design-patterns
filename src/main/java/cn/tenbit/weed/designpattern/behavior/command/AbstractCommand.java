package cn.tenbit.weed.designpattern.behavior.command;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 17:09
 */
public abstract class AbstractCommand implements Command {

    private Recevier recevier;

    void setRecevier(Recevier recevier) {
        this.recevier = recevier;
    }

    Recevier getRecevier() {
        return recevier;
    }
}
