package cn.tenbit.weed.designpattern.structure.adapter;

import lombok.Getter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:27
 */
public enum MusicTypeEnums {

    UNKNOWN(99, "unknown"),
    MP3(100, "mp3"),
    WMA(101, "wma"),
    ;

    @Getter
    private int value;
    @Getter
    private String suffix;

    MusicTypeEnums(int value, String suffix) {
        this.value = value;
        this.suffix = suffix;
    }
}
