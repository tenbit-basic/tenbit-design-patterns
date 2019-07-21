package cn.tenbit.weed.designpattern.behavior.mediator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 17:04
 */
public class SimpleMediator implements Mediator {

    private final Set<Customer> customers = new LinkedHashSet<>();

    @Override
    public void register(Customer member) {
        customers.add(member);
        ((SimpleCustomer) member).setMediator(this);
    }

    @Override
    public void relay(Message message) {
        for (Customer customer : customers) {
            if (customer != message.getCustomer()) {
                customer.recv(message);
            }
        }
    }
}
