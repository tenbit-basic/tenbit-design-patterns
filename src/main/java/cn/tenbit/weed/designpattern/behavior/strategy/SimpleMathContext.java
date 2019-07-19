package cn.tenbit.weed.designpattern.behavior.strategy;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 16:12
 */
public class SimpleMathContext implements MathContext {

    private MathStrategy strategy;

    @Override
    public void strategy(MathStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void calculate(int a, int b) {
        HarePrintUtils.console(strategy.calculate(a,b));
    }
}
