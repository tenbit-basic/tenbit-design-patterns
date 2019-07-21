package cn.tenbit.weed.designpattern.behavior.responsibilitychain;

import cn.tenbit.hare.core.lite.exception.HareExceptions;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 09:12
 */
public class ChainTest {

    @Test
    public void test() {
        Leader<LeaveVocationTransaction> leader1 = new SimpleLeader<LeaveVocationTransaction>() {
            @Override
            public void handle(LeaveVocationTransaction t) {
                if (t.getDays() < 15) {
                    super.handle(t);
                    return;
                }
                HareExceptions.ofBiz("leader1 不允许请假").makeThrow();
            }
        };

        Leader<LeaveVocationTransaction> leader2 = new SimpleLeader<LeaveVocationTransaction>() {
            @Override
            public void handle(LeaveVocationTransaction t) {
                if (t.getDays() < 10) {
                    super.handle(t);
                    return;
                }
                HareExceptions.ofBiz("leader2 不允许请假").makeThrow();
            }
        };

        Leader<LeaveVocationTransaction> leader3 = new SimpleLeader<LeaveVocationTransaction>() {
            @Override
            public void handle(LeaveVocationTransaction t) {
                if (t.getDays() < 5) {
                    super.handle(t);
                    return;
                }
                HareExceptions.ofBiz("leader3 不允许请假").makeThrow();
            }
        };

        leader1.setNext(leader2).setNext(leader3);

        LeaveVocationTransaction t = new LeaveVocationTransaction();
        t.setDays(4);

        leader1.handle(t);
    }
}
