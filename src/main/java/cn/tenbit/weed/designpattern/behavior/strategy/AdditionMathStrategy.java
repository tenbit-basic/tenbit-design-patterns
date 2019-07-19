package cn.tenbit.weed.designpattern.behavior.strategy;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 16:11
 */
public class AdditionMathStrategy implements MathStrategy {

    @Override
    public long calculate(int a, int b) {
        return a + b;
    }
}
