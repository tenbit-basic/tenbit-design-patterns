package cn.tenbit.weed.designpattern.principle;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 迪米特法则
 *
 * @Author bangquan.qian
 * @Date 2019-06-28 15:49
 */
public class LawOfDemeter {

    /**
     * 比起明星直接会面粉丝，不如找一个经纪人，经纪人负责实现细节
     */
    public static void main(String[] args) {
        Agent agent = Agent.builder()
                .company(new Company("哈哈娱乐公司"))
                .star(new Star("大明"))
                .build();

        agent.meeting(new Fan("痴痴"));
    }
}

@Getter
@AllArgsConstructor
class Star {
    private String name;
}

@Getter
@AllArgsConstructor
class Company {
    private String name;
}

@Getter
@AllArgsConstructor
class Fan {
    private String name;
}

@Builder
class Agent {
    private Star star;
    private Company company;

    public void meeting(Fan fan) {
        HarePrintUtils.console(company.getName() + "经纪人安排" + star.getName() + "会面粉丝" + fan.getName());
    }
}