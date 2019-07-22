package cn.tenbit.weed.designpattern.behavior.visitor;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 16:07
 */
public class MoneyCompany implements Company<Paper> {

    @Override
    public String create(Paper material) {
        return "money";
    }
}
