package cn.tenbit.weed.designpattern.creation.prototype;

import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.weed.designpattern.common.model.computer2.Computer;
import cn.tenbit.weed.designpattern.common.model.computer2.ComputerEnums;
import cn.tenbit.weed.designpattern.common.model.computer2.CpuImpl;
import cn.tenbit.weed.designpattern.common.model.computer2.MotherBoardImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:48
 */
public class ComputerFactory {

    private static final Map<ComputerEnums, Computer> NAME_MAP_COMPUTER = new ConcurrentHashMap<>();

    public static Computer getComputer(ComputerEnums enu) throws Exception {
        HareAssertUtils.notNull(enu);
        Computer computer = null;
        if ((computer = NAME_MAP_COMPUTER.get(enu)) != null) {
            return (Computer) computer.clone();
        }
        synchronized (enu) {
            if ((computer = NAME_MAP_COMPUTER.get(enu)) != null) {
                return computer;
            }
            NAME_MAP_COMPUTER.putIfAbsent(enu, computer = doGetComputer(enu));
            return computer;
        }
    }

    private static Computer doGetComputer(ComputerEnums enu) {
        HareAssertUtils.notNull(enu);
        Computer computer = null;
        switch (enu) {
            default:
                break;
            case ASUS:
                computer = Computer.newBuilder()
                        .cpu(new CpuImpl("intel-cpu"))
                        .motherBoard(new MotherBoardImpl("asus-mother-board"))
                        .build();
                break;
            case DELL:
                computer = Computer.newBuilder()
                        .cpu(new CpuImpl("amd-cpu"))
                        .motherBoard(new MotherBoardImpl("dell-mother-board"))
                        .build();
                break;
        }
        HareAssertUtils.notNull(computer);
        return computer;
    }
}
