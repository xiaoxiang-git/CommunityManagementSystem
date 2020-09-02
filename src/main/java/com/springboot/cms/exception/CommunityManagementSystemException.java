package com.springboot.cms.exception;

/**
 * 自定义异常类
 *
 * @author xiaoxiang
 */
public class CommunityManagementSystemException extends RuntimeException {

    /**
     * 状态码
     */
    private Integer code;

    public CommunityManagementSystemException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
