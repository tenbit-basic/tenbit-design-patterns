package cn.tenbit.weed.designpattern.structure.decorator;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 10:32
 */
public class DecoratorTest {

    @Test
    public void test() {
        Printer printer = new SimplePrinter();
        printer.print("123");

        HarePrintUtils.newline();

        printer = new DecoratePrinter(printer);
        printer.print("123");
    }
}
