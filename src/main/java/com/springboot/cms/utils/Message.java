package com.springboot.cms.utils;

/**
 * 自定义相应返回类型
 * @author xiaoxiang
 *
 */
public class Message<T> {
		/**
		 * 状态码
		 */
		private Integer status;
		
		/**
		 * 返回信息
		 */
		private String message;
		
		/**
		 * 返回数据
		 */
		private T data;
		
		/**
		 * 时间
		 */
		private Long time;

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Long getTime() {
			return time;
		}

		public void setTime(Long time) {
			this.time = time;
		}

		public Message(Integer status, String message, T data, Long time) {
			super();
			this.status = status;
			this.message = message;
			this.data = data;
			this.time = time;
		}

		public Message() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
