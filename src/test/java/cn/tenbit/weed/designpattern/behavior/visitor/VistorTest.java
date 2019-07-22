package cn.tenbit.weed.designpattern.behavior.visitor;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 16:21
 */
public class VistorTest {

    @Test
    public void test() {
        Paper paper = new Paper();

        MoneyCompany moneyCompany = new MoneyCompany();
        BookCompany bookCompany = new BookCompany();

        HarePrintUtils.console(paper.accept(moneyCompany));
        HarePrintUtils.console(paper.accept(bookCompany));
    }
}
