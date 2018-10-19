package com.seu.common.validator;

import com.seu.common.exception.RestException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RestException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RestException(message);
        }
    }
}
