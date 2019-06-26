package cn.tenbit.weed.designpattern.behavior.prototype;

import cn.tenbit.hare.core.lite.util.HareInvokeUtils;
import cn.tenbit.hare.core.lite.util.HareLogUtils;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.common.model.computer2.Computer;
import cn.tenbit.weed.designpattern.common.model.computer2.ComputerEnums;
import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 16:05
 */
public class PrototypeTest {

    @Test
    public void test() throws Exception {
        HarePrintUtils.prettyJsonConsole(
                Lists.newArrayList(
                        HareInvokeUtils.invoke(() -> {
                            try {
                                Computer computer = ComputerFactory.getComputer(ComputerEnums.ASUS);
                                HarePrintUtils.jsonConsole(computer.hashCode(), computer);
                            } catch (Exception e) {
                                HareLogUtils.error("invoke", e);
                            }
                        }),
                        HareInvokeUtils.invoke(() -> {
                            try {
                                Computer computer = ComputerFactory.getComputer(ComputerEnums.ASUS);
                                HarePrintUtils.jsonConsole(computer.hashCode(), computer);
                            } catch (Exception e) {
                                HareLogUtils.error("invoke", e);
                            }
                        }),
                        HareInvokeUtils.invoke(() -> {
                            try {
                                Computer computer = ComputerFactory.getComputer(ComputerEnums.DELL);
                                HarePrintUtils.jsonConsole(computer.hashCode(), computer);
                            } catch (Exception e) {
                                HareLogUtils.error("invoke", e);
                            }
                        }),
                        HareInvokeUtils.invoke(() -> {
                            try {
                                Computer computer = ComputerFactory.getComputer(ComputerEnums.DELL);
                                HarePrintUtils.jsonConsole(computer.hashCode(), computer);
                            } catch (Exception e) {
                                HareLogUtils.error("invoke", e);
                            }
                        })
                )
        );
    }
}
