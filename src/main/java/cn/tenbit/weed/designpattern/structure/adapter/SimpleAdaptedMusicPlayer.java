package cn.tenbit.weed.designpattern.structure.adapter;

import cn.tenbit.hare.core.lite.util.HareAssertUtils;
import cn.tenbit.hare.core.lite.util.HarePrintUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:24
 */
public class SimpleAdaptedMusicPlayer implements MusicPlayer {

    private MusicDetector detector = new SimpleMusicDetector();

    private MusicDecoder decoder = new SimpleMusicDecoder();

    private SimpleMusicPlayerAdapter adapter = new SimpleMusicPlayerAdapter();

    @Override
    public void play(String file) {
        adapter.play(file);
        // doPlay(file);
    }

    @Deprecated
    private void doPlay(String file) {
        MusicTypeEnums type = detector.detect(file);
        HareAssertUtils.notNull(type, "file not support");
        byte[] bytes = decoder.decode(file);
        HarePrintUtils.jsonConsole(type, file, bytes);
    }
}
