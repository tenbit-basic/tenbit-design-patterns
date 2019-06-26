package cn.tenbit.weed.designpattern.behavior.builder;

import cn.tenbit.weed.designpattern.common.model.computer.Computer;
import cn.tenbit.weed.designpattern.common.model.computer.Cpu;
import cn.tenbit.weed.designpattern.common.model.computer.MotherBoard;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:24
 */
public class ComputerBuilder2 {

    private Cpu cpu;

    private MotherBoard motherBoard;

    public ComputerBuilder2 cpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder2 motherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, motherBoard);
    }

    public static ComputerBuilder2 newBuilder() {
        return new ComputerBuilder2();
    }
}
