package cn.tenbit.weed.designpattern.creation.builder;

import cn.tenbit.weed.designpattern.common.model.computer.Computer;
import cn.tenbit.weed.designpattern.common.model.computer.Cpu;
import cn.tenbit.weed.designpattern.common.model.computer.MotherBoard;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:24
 */
public class ComputerBuilder {

    private Computer computer = new Computer();

    public ComputerBuilder cpu(Cpu cpu) {
        this.computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder motherBoard(MotherBoard motherBoard) {
        this.computer.setMotherBoard(motherBoard);
        return this;
    }

    public Computer build() {
        return this.computer;
    }

    public static ComputerBuilder newBuilder() {
        return new ComputerBuilder();
    }
}
