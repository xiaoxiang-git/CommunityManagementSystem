package com.springboot.cms.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 自定义消息实体类
 *
 * @author xiaoxiang
 */
public class Message<T> implements Serializable {

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 时间
     */
    private final String TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    public Message(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public Message(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

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

    public String getTIME() {
        return TIME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message<?> message1 = (Message<?>) o;
        return Objects.equals(status, message1.status) &&
                Objects.equals(message, message1.message) &&
                Objects.equals(data, message1.data) &&
                Objects.equals(TIME, message1.TIME);
    }

    @Override
    public int hashCode() {

        return Objects.hash(status, message, data, TIME);
    }

    @Override
    public String toString() {
        return "Message{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", TIME='" + TIME + '\'' +
                '}';
    }
}
