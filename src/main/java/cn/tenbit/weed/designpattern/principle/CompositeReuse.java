package cn.tenbit.weed.designpattern.principle;

import cn.tenbit.hare.core.lite.util.HareInvokeUtils;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;
import lombok.*;

/**
 * 合成复用原则
 *
 * @Author bangquan.qian
 * @Date 2019-06-28 14:42
 */
public class CompositeReuse {

    /**
     * 推荐使用组合，而不是继承
     */
    public static void main(String[] args) {

        HareInvokeUtils.invoke(() -> {
            Car oldCar = new RedFuelCar();
            HarePrintUtils.jsonConsole(oldCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car oldCar = new RedElecCar();
            HarePrintUtils.jsonConsole(oldCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car oldCar = new GreenFuelCar();
            HarePrintUtils.jsonConsole(oldCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car oldCar = new GreenElecCar();
            HarePrintUtils.jsonConsole(oldCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car newCar = SmartCar.builder()
                    .color(new SmartColor("red"))
                    .power(new SmartPower("elec"))
                    .build();
            HarePrintUtils.jsonConsole(newCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car newCar = SmartCar.builder()
                    .color(new SmartColor("red"))
                    .power(new SmartPower("fuel"))
                    .build();
            HarePrintUtils.jsonConsole(newCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car newCar = SmartCar.builder()
                    .color(new SmartColor("green"))
                    .power(new SmartPower("elec"))
                    .build();
            HarePrintUtils.jsonConsole(newCar);
        });

        HareInvokeUtils.invoke(() -> {
            Car newCar = SmartCar.builder()
                    .color(new SmartColor("green"))
                    .power(new SmartPower("fuel"))
                    .build();
            HarePrintUtils.jsonConsole(newCar);
        });
    }
}


//------------------------- 错误案例 -------------------------//

interface Car {
    String getDescription();
}

abstract class FuelCar implements Car {
}

abstract class ElecCar implements Car {
}

class RedFuelCar extends FuelCar {
    @Override
    public String getDescription() {
        return "red" + "fuel" + "car";
    }
}

class RedElecCar extends ElecCar {
    @Override
    public String getDescription() {
        return "red" + "elec" + "car";
    }
}

class GreenFuelCar extends FuelCar {
    @Override
    public String getDescription() {
        return "green" + "fuel" + "car";
    }
}

class GreenElecCar extends ElecCar {
    @Override
    public String getDescription() {
        return "green" + "elec" + "car";
    }
}

//------------------------- 建议案例 -------------------------//

interface Power {
    String getPower();
}

interface Color {
    String getColor();
}

@Getter
@AllArgsConstructor
class SmartColor implements Color {
    private String color;
}

@Getter
@AllArgsConstructor
class SmartPower implements Power {
    private String power;
}

@Builder
class SmartCar implements Car {

    private Power power;

    private Color color;

    @Override
    public String getDescription() {
        return color.getColor() + power.getPower() + "car";
    }
}