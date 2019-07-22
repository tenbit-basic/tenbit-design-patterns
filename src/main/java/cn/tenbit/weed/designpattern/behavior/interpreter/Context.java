package cn.tenbit.weed.designpattern.behavior.interpreter;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

//环境类
public class Context {

    private String[] citys = {"韶关", "广州"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression cityPerson;

    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        if (cityPerson.interpret(info)) {
            HarePrintUtils.console("您是" + info + "，您本次乘车免费！");
        } else {
            HarePrintUtils.console(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}