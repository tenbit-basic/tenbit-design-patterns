package cn.tenbit.weed.designpattern.structure.facade;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 10:43
 */
public class FacadeTest {

    @Test
    public void test() {
        FacadeService service = new FacadeServiceImpl();
        service.doA();
        service.doB();
    }
}
