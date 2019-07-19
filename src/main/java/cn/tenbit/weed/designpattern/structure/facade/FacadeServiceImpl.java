package cn.tenbit.weed.designpattern.structure.facade;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 10:42
 */
public class FacadeServiceImpl implements FacadeService {

    private ServiceA serviceA = new ServiceA();

    private ServiceB serviceB = new ServiceB();

    @Override
    public void doA() {
        serviceA.doA();
    }

    @Override
    public void doB() {
        serviceB.doB();
    }
}
