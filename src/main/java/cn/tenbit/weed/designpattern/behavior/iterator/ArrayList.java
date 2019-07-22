package cn.tenbit.weed.designpattern.behavior.iterator;

import cn.tenbit.hare.core.lite.constant.HareConsts;
import cn.tenbit.hare.core.lite.util.HareAssertUtils;

import java.util.Arrays;

/**
 * @Author bangquan.qian
 * @Date 2019-07-22 13:41
 */
public class ArrayList<T> implements List<T> {

    private static final int MAX_SIZE = 10;

    private Object[] elementData = new Object[MAX_SIZE];

    private int cursor = 0;

    @Override
    public void add(Object t) {
        HareAssertUtils.isTrue(cursor < MAX_SIZE);
        elementData[cursor++] = t;
    }

    @Override
    public Iterable<T> iterator() {
        return new Iterator<>(Arrays.copyOf(elementData, cursor));
    }

    public static class Iterator<T> implements Iterable<T> {

        private Object[] data = null;

        private int cursor = 0;

        public Iterator(Object[] data) {
            this.data = data;
        }

        @Override
        public boolean hasNext() {
            return cursor < data.length;
        }

        @Override
        @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
        public T next() {
            HareAssertUtils.isTrue(hasNext());
            return (T) data[cursor++];
        }
    }
}
