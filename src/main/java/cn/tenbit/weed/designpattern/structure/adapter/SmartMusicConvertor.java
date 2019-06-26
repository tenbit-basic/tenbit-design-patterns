package cn.tenbit.weed.designpattern.structure.adapter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 18:01
 */
public class SmartMusicConvertor implements MusicConvertor {

    @Override
    public byte[] convert(String file) {
        return new byte[0];
    }
}
