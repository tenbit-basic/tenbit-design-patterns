package cn.tenbit.weed.designpattern.structure.filter;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-07-11 11:21
 */
public class FilterTest {

    @Test
    public void test() {
        List<Person> list = Lists.newArrayList(
                Person.builder().name("jack").age(20).sex(0).build(),
                Person.builder().name("jack").age(15).sex(1).build(),
                Person.builder().name("jack").age(45).sex(0).build(),
                Person.builder().name("jack").age(12).sex(1).build(),
                Person.builder().name("jack").age(33).sex(1).build(),
                Person.builder().name("jack").age(11).sex(0).build()
        );

        Criteria<List<Person>> criteria = Criteria.<List<Person>>of()
                .then(new MaleCriteria())
                .then(new AdultCriteria());

        List<Person> rist = criteria.handle(list);
        HarePrintUtils.prettyJsonConsole(rist);
    }
}
