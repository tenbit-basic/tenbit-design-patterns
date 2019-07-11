package cn.tenbit.weed.designpattern.structure.filter;

import lombok.*;

/**
 * @Author bangquan.qian
 * @Date 2019-07-09 15:34
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;

    private Integer age;

    private Integer sex;
}
