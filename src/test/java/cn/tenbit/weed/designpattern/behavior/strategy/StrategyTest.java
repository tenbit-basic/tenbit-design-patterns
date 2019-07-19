package cn.tenbit.weed.designpattern.behavior.strategy;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 16:26
 */
public class StrategyTest {

    @Test
    public void test() {
        MathContext context = new SimpleMathContext();

        context.strategy(new AdditionMathStrategy());
        context.calculate(1, 2);

        context.strategy(new SubtractionMathStrategy());
        context.calculate(1, 2);
    }
}
