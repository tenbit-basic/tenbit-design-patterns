package cn.tenbit.weed.designpattern.common.model.computer2;

import cn.tenbit.hare.core.lite.util.HareSleepUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 15:18
 */
public class MotherBoardImpl implements MotherBoard {

    private String name;

    public MotherBoardImpl(String name) {
        HareSleepUtils.sleepSeconds(1);
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name;
    }
}
