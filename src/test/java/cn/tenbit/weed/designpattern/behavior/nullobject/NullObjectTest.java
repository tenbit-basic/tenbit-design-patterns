package cn.tenbit.weed.designpattern.behavior.nullobject;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 16:04
 */
public class NullObjectTest {

    @Test
    public void test(){
        Optional<Object> optional = null;
        // optional = Optional.ofNullable(null);
        optional = Optional.ofNullable(1);
        Object o = optional.get();
        HarePrintUtils.console(o);
    }
}
