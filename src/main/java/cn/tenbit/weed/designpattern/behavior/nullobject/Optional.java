package cn.tenbit.weed.designpattern.behavior.nullobject;

import cn.tenbit.hare.core.lite.constant.HareConsts;
import cn.tenbit.hare.core.lite.util.HareObjectUtils;

import java.util.NoSuchElementException;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 16:04
 */
public class Optional<T> {

    private static final Optional<?> EMPTY = new Optional<>();

    private final T value;

    private Optional() {
        value = null;
    }

    private Optional(T value) {
        this.value = HareObjectUtils.requireNonNull(value);
    }

    @SuppressWarnings(HareConsts.SUPPRESS_WARNING_UNCHECKED)
    public static <T> Optional<T> empty() {
        return (Optional<T>) EMPTY;
    }

    public static <T> Optional<T> of(T value) {
        return new Optional<>(value);
    }

    public static <T> Optional<T> ofNullable(T value) {
        return value == null ? empty() : of(value);
    }

    public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }
}
