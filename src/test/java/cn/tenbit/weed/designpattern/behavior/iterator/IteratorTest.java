package cn.tenbit.weed.designpattern.behavior.iterator;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 15:49
 */
public class IteratorTest {

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterable<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            HarePrintUtils.console(iterator.next());
        }
    }
}
