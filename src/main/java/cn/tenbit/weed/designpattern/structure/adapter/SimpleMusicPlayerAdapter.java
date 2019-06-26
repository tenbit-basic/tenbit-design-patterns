package cn.tenbit.weed.designpattern.structure.adapter;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 18:19
 */
public class SimpleMusicPlayerAdapter implements MusicPlayer {

    private MusicPlayer player = new SmartMusicPlayer();

    @Override
    public void play(String file) {
        player.play(file);
    }
}
