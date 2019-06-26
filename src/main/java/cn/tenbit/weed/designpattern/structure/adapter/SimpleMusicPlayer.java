package cn.tenbit.weed.designpattern.structure.adapter;

import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:24
 */
public class SimpleMusicPlayer implements MusicPlayer {

    private MusicDetector detector = new SimpleMusicDetector();

    private MusicDecoder decoder = new SimpleMusicDecoder();

    @Override
    public void play(String file) {
        doPlay(file);
    }

    private void doPlay(String file) {
        MusicTypeEnums type = detector.detect(file);
        HareAssertUtils.notNull(type, "file not support");
        byte[] bytes = decoder.decode(file);
        HarePrintUtils.jsonConsole(type, file, bytes);
    }
}
