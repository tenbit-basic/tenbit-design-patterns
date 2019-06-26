package cn.tenbit.weed.designpattern.structure.adapter;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author bangquan.qian
 * @Date 2019-06-26 17:29
 */
public class SmartMusicDetector implements MusicDetector {

    @Override
    public MusicTypeEnums detect(String file) {
        if (StringUtils.isBlank(file)) {
            return null;
        }
        file = StringUtils.trim(file);
        for (MusicTypeEnums enu : MusicTypeEnums.values()) {
            if (match(file, enu)) {
                return enu;
            }
        }
        return null;
    }

    @Override
    public MusicTypeEnums detect(byte[] file) {
        return MusicTypeEnums.UNKNOWN;
    }

    private boolean match(String file, MusicTypeEnums enu) {
        return file.endsWith("." + enu.getSuffix());
    }
}
