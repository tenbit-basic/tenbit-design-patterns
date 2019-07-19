package cn.tenbit.weed.designpattern.behavior.template;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 15:46
 */
public class DruidDataSource extends AbstractDataSource implements DataSource {

    public DruidDataSource(String name) {
        super(name);
    }
}
