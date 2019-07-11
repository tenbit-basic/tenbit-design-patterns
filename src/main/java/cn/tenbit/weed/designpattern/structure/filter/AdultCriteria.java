package cn.tenbit.weed.designpattern.structure.filter;

import cn.tenbit.hare.core.lite.util.HareCompareUtils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author bangquan.qian
 * @Date 2019-07-10 14:52
 */
public class AdultCriteria extends AbstractCriteria<List<Person>> implements Criteria<List<Person>> {

    @Override
    public List<Person> handle(List<Person> list) {
        if (CollectionUtils.isEmpty(list)) {
            return list;
        }
        return super.handle(
                list.stream()
                        .filter((e) -> HareCompareUtils.ge(e.getAge(), Consts.AGE_ADULT))
                        .collect(Collectors.toList())
        );
    }
}
