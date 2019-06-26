package cn.tenbit.weed.designpattern.creation.builder;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import cn.tenbit.weed.designpattern.common.model.computer.AmdCpu;
import cn.tenbit.weed.designpattern.common.model.computer.AsusMotherBoard;
import cn.tenbit.weed.designpattern.common.model.computer.Computer;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:27
 */
public class BuilderTest {

    @Test
    public void test() {
        Computer computer = ComputerBuilder.newBuilder()
                .cpu(new AmdCpu())
                .motherBoard(new AsusMotherBoard())
                .build();
        HarePrintUtils.jsonConsole(computer);
    }

    @Test
    public void test2() {
        Computer computer = ComputerBuilder2.newBuilder()
                .cpu(new AmdCpu())
                .motherBoard(new AsusMotherBoard())
                .build();
        HarePrintUtils.jsonConsole(computer);
    }
}
