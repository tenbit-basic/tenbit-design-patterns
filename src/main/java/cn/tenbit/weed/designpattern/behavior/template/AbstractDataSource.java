package cn.tenbit.weed.designpattern.behavior.template;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 15:46
 */
public abstract class AbstractDataSource implements DataSource {

    private String name;

    public AbstractDataSource(String name) {
        this.name = name;
    }

    @Override
    public Connection getConnection() {
        HarePrintUtils.console(name + " connection");
        return null;
    }
}
