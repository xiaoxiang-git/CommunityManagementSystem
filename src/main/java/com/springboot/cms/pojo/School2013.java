package com.springboot.cms.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 全国高校实体类
 * 2013版
 *
 * @author YuanhuiHo
 */
public class School2013 implements Serializable {

    private Integer id;
    private String name;
    private String place;
    private String type;
    private String properties;

    public School2013() {
    }

    public School2013(Integer id, String name, String place, String type, String properties) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.type = type;
        this.properties = properties;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School2013 that = (School2013) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(place, that.place) &&
                Objects.equals(type, that.type) &&
                Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, place, type, properties);
    }

    @Override
    public String toString() {
        return "School2013{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", type='" + type + '\'' +
                ", properties='" + properties + '\'' +
                '}';
    }
}
