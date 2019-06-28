package cn.tenbit.weed.designpattern.principle;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * 接口隔离原则
 *
 * @Author bangquan.qian
 * @Date 2019-06-28 16:06
 */
public class InterfaceSegregation {

    public static void main(String[] args) {
        DataManage manage = new SmartDataManage();
        manage.insert();
        manage.update();
        manage.delete();
        manage.search();
        manage.analyse();
    }
}

interface DataModify {

    void insert();

    void delete();

    void update();
}

class SmartDataModify implements DataModify {

    @Override
    public void insert() {
        HarePrintUtils.console("insert");
    }

    @Override
    public void delete() {
        HarePrintUtils.console("delete");
    }

    @Override
    public void update() {
        HarePrintUtils.console("update");
    }
}

interface DataAnalyse {

    void analyse();
}

class SmartDataAnalyse implements DataAnalyse {

    @Override
    public void analyse() {
        HarePrintUtils.console("analyse");
    }
}

interface DataSearch {

    void search();
}

class SmartDataSearch implements DataSearch {

    @Override
    public void search() {
        HarePrintUtils.console("search");
    }
}

interface DataManage extends DataModify, DataSearch, DataAnalyse {
}

class SmartDataManage implements DataManage {

    private DataSearch search = new SmartDataSearch();

    private DataAnalyse analyse = new SmartDataAnalyse();

    private DataModify modify = new SmartDataModify();

    @Override
    public void insert() {
        modify.insert();
    }

    @Override
    public void delete() {
        modify.delete();
    }

    @Override
    public void update() {
        modify.update();
    }

    @Override
    public void analyse() {
        analyse.analyse();
    }

    @Override
    public void search() {
        search.search();
    }
}
