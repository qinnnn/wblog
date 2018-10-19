package com.seu.common.utils;

import java.util.HashMap;


/**
 * Map工具类
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
