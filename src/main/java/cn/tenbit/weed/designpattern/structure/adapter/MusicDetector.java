package cn.tenbit.weed.designpattern.structure.adapter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:25
 */
public interface MusicDetector {

    MusicTypeEnums detect(String file);

    MusicTypeEnums detect(byte[] file);
}
