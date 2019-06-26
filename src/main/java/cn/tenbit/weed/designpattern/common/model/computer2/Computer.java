package cn.tenbit.weed.designpattern.common.model.computer2;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:17
 */
@Getter
@AllArgsConstructor
public class Computer implements Cloneable {

    private final Cpu cpu;

    private final MotherBoard motherBoard;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static ComputerBuilder newBuilder() {
        return new ComputerBuilder();
    }

    public static class ComputerBuilder {

        private Cpu cpu;

        private MotherBoard motherBoard;

        public ComputerBuilder cpu(Cpu cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder motherBoard(MotherBoard motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, motherBoard);
        }
    }
}
