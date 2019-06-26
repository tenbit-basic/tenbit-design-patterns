package cn.tenbit.weed.designpattern.structure.adapter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 18:04
 */
public class SimpleMusicDecoder implements MusicDecoder {

    @Override
    public byte[] decode(String file) {
        return new byte[0];
    }
}
