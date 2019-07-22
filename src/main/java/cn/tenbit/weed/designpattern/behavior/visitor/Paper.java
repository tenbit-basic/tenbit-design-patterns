package cn.tenbit.weed.designpattern.behavior.visitor;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 16:07
 */
public class Paper implements Material {

    @Override
    public String accept(Company<? extends Material> visitor) {
        if (visitor instanceof MoneyCompany) {
            return ((MoneyCompany) visitor).create(this);
        }
        if (visitor instanceof BookCompany) {
            return ((BookCompany) visitor).create(this);
        }
        return null;
    }
}
