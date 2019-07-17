package cn.tenbit.weed.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-07-17 14:05
 */
public class Box extends Item {

    private final List<Item> items = new ArrayList<>();

    public Box(String name) {
        super(name);
    }

    public List<Item> getItems() {
        return items;
    }

    public Box addItem(Item item) {
        items.add(item);
        return this;
    }
}
