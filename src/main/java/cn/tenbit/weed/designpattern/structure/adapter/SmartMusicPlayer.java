package cn.tenbit.weed.designpattern.structure.adapter;

import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:57
 */
public class SmartMusicPlayer implements MusicPlayer {

    private MusicDetector detector = new SmartMusicDetector();

    private MusicDecoder decoder = new SimpleMusicDecoder();

    private MusicConvertor convertor = new SmartMusicConvertor();

    @Override
    public void play(String file) {
        doPlay(file);
    }

    private void doPlay(String file) {
        MusicTypeEnums type = detector.detect(file);
        byte[] bytes = null;
        if (type == null) {
            bytes = convertor.convert(file);
            type = MusicTypeEnums.UNKNOWN;
        } else {
            bytes = decoder.decode(file);
        }
        HarePrintUtils.jsonConsole(type, file, bytes);
    }
}
