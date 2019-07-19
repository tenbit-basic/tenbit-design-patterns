package cn.tenbit.weed.designpattern.structure.decorator;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 10:30
 */
public class DecoratePrinter implements Printer {

    private Printer printer;

    public DecoratePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String str) {
        HarePrintUtils.console("----- start -----");
        printer.print(str);
        HarePrintUtils.console("----- end -----");
    }
}
