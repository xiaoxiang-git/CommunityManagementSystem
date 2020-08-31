package com.springboot.cms.utils;

/**
 * 自定义异常
 * @author xiaoxiang
 *
 */
public class CommunityManagementSystemException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 状态码
	 */
	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	public CommunityManagementSystemException(Integer code, String message) {
		super(message);
		this.code=code;
	}
}
