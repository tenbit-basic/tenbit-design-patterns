package cn.tenbit.weed.designpattern.structure.adapter;

import cn.tenbit.hare.core.lite.util.HareInvokeUtils;
import org.junit.Test;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 18:21
 */
public class AdapterTest {

    @Test
    public void test() {
        final MusicPlayer simpleMusicPlayer = new SimpleMusicPlayer();
        HareInvokeUtils.invokeWithSwallow(() -> simpleMusicPlayer.play("hello.mp3"));
        HareInvokeUtils.invokeWithSwallow(() -> simpleMusicPlayer.play("hello.acr"));

        final MusicPlayer smartMusicPlayer = new SmartMusicPlayer();
        HareInvokeUtils.invokeWithSwallow(() -> smartMusicPlayer.play("hello.mp3"));
        HareInvokeUtils.invokeWithSwallow(() -> smartMusicPlayer.play("hello.acr"));

        final MusicPlayer simpleAdaptedMusicPlayer = new SimpleAdaptedMusicPlayer();
        HareInvokeUtils.invokeWithSwallow(() -> simpleAdaptedMusicPlayer.play("hello.mp3"));
        HareInvokeUtils.invokeWithSwallow(() -> simpleAdaptedMusicPlayer.play("hello.acr"));
    }
}
