package cn.tenbit.weed.designpattern.behavior.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 17:00
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Message {

    private Customer customer;

    private String content;
}
