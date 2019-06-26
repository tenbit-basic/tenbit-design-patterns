package cn.tenbit.weed.designpattern.structure.adapter;

import cn.tenbit.hare.core.lite.exception.HareExceptions;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:29
 */
public class SimpleMusicDetector implements MusicDetector {

    @Override
    public MusicTypeEnums detect(String file) {
        if (StringUtils.isBlank(file)) {
            return null;
        }
        file = StringUtils.trim(file);
        if (match(file, MusicTypeEnums.MP3)) {
            return MusicTypeEnums.MP3;
        }
        return null;
    }

    @Override
    public MusicTypeEnums detect(byte[] file) {
        throw HareExceptions.UNSUPPORTED.newOne();
    }

    private boolean match(String file, MusicTypeEnums enu) {
        return file.endsWith("." + enu.getSuffix());
    }
}
