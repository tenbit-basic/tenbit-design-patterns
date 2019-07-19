package cn.tenbit.weed.designpattern.behavior.template;

import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-07-19 15:59
 */
public class TemplateTest {

    @Test
    public void test() {
        SqlSessionTemplate template = new SqlSessionTemplate(new DruidDataSource("druid"));
        template.delete();
    }
}
