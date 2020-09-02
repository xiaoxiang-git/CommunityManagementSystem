package com.springboot.cms.util;

import com.springboot.cms.constant.StatusCode;
import com.springboot.cms.model.Message;

/**
 * 创建消息工具类
 *
 * @author xiaoxiang
 */
public class MessageUtil {
    /**
     * 成功
     */
    public static <T> Message<T> success(T object) {
        return new Message<T>(StatusCode.NORMAL_CODE, "success", object);
    }

    /**
     * 失败
     */
    public static <T> Message<T> failure(T message) {
        return new Message<T>(StatusCode.EXCEPTIONMESSAGE_CODE, "failure", message);
    }

}
