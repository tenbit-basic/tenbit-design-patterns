package cn.tenbit.weed.designpattern.structure.flyweight;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 12:35
 */
public class CircleBox {

    public static final UnmutableCircle RED = new UnmutableCircle("red");
    public static final UnmutableCircle YELLOW = new UnmutableCircle("yellow");
    public static final UnmutableCircle BLUE = new UnmutableCircle("blue");

    private final List<UnmutableCircle> circleList = new ArrayList<>();

    private CircleBox() {
    }

    public CircleBox add(UnmutableCircle circle) {
        circleList.add(circle);
        return this;
    }

    public void show() {
        circleList.forEach(HarePrintUtils::jsonConsole);
    }

    private static class UnmutableCircle {

        private String name;

        public UnmutableCircle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static CircleBox of() {
        return new CircleBox();
    }
}
