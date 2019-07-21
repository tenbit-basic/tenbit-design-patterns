package cn.tenbit.weed.designpattern.behavior.mediator;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 17:08
 */
public class MediatorTest {

    @Test
    public void test() {
        Mediator mediator = new SimpleMediator();

        Customer seller = new SimpleCustomer();
        Customer buyer = new SimpleCustomer();

        mediator.register(seller);
        mediator.register(buyer);

        seller.send(Message.of(seller, "hello"));
    }

}
