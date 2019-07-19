package cn.tenbit.weed.designpattern.structure.decorator;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 10:29
 */
public class SimplePrinter implements Printer {

    @Override
    public void print(String str) {
        HarePrintUtils.jsonConsole(str);
    }
}
