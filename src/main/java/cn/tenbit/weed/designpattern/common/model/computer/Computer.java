package cn.tenbit.weed.designpattern.common.model.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:17
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer {

    private Cpu cpu;

    private MotherBoard motherBoard;
}
