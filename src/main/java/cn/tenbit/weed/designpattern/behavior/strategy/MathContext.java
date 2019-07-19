package cn.tenbit.weed.designpattern.behavior.strategy;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 16:11
 */
public interface MathContext {

    void strategy(MathStrategy strategy);

    void calculate(int a, int b);
}
