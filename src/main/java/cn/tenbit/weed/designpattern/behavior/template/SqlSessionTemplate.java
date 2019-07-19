package cn.tenbit.weed.designpattern.behavior.template;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 15:46
 */
public class SqlSessionTemplate implements SqlSessionOperations {

    private DataSource dataSource;

    public SqlSessionTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() {
        return dataSource.getConnection();
    }

    @Override
    public void insert() {
        Connection cnn = getConnection();
        HarePrintUtils.console("insert");
    }

    @Override
    public void update() {
        Connection cnn = getConnection();
        HarePrintUtils.console("update");
    }

    @Override
    public void delete() {
        Connection cnn = getConnection();
        HarePrintUtils.console("delete");
    }

    @Override
    public void select() {
        Connection cnn = getConnection();
        HarePrintUtils.console("select");
    }
}
