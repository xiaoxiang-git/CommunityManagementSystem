package com.springboot.cms.utils;

import java.util.Date;

/**
 * 
 * 返回消息的工具类
 * @author xiaoxiang
 *
 */

public class MessageUtil {
	/**
	 *成功，并且返回数据
	 *
	 */
	public static <E>Message<E> success(E obj){
		return new Message<E>(200, "success", obj, new Date().getTime());
	}
	
	/**
	 * 成功，但无返回数据
	 *
	 */
	public static <E>Message<E> success(){
		return new Message<E>(200, "success", null, new Date().getTime());
	}
	
	/**
	 * 失败,将自定义异常信息返回
	 *
	 */
	public static <E>Message<E> error(Integer code,String msg){
		return new Message<E>(code, msg, null, new Date().getTime());
	}
	
}
