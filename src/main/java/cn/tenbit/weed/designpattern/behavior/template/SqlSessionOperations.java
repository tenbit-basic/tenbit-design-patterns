package cn.tenbit.weed.designpattern.behavior.template;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 15:56
 */
public interface SqlSessionOperations {

    void insert();

    void update();

    void delete();

    void select();
}
