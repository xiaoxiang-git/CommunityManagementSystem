package com.springboot.cms.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 全国高校实体类
 * 2019版
 *
 * @author YuanhuiHo
 */
public class School2019 implements Serializable {

    private Integer id;
    private String school_id;
    private String school_name;
    private String province_id;
    private String province_name;
    private String city_id;
    private String city_name;
    private String level;
    private String department;
    private String other;

    public School2019() {
    }

    public School2019(Integer id, String school_id, String school_name, String province_id, String province_name, String city_id, String city_name, String level, String department, String other) {
        this.id = id;
        this.school_id = school_id;
        this.school_name = school_name;
        this.province_id = province_id;
        this.province_name = province_name;
        this.city_id = city_id;
        this.city_name = city_name;
        this.level = level;
        this.department = department;
        this.other = other;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School2019 that = (School2019) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(school_id, that.school_id) &&
                Objects.equals(school_name, that.school_name) &&
                Objects.equals(province_id, that.province_id) &&
                Objects.equals(province_name, that.province_name) &&
                Objects.equals(city_id, that.city_id) &&
                Objects.equals(city_name, that.city_name) &&
                Objects.equals(level, that.level) &&
                Objects.equals(department, that.department) &&
                Objects.equals(other, that.other);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, school_id, school_name, province_id, province_name, city_id, city_name, level, department, other);
    }

    @Override
    public String toString() {
        return "School2019{" +
                "id=" + id +
                ", school_id='" + school_id + '\'' +
                ", school_name='" + school_name + '\'' +
                ", province_id='" + province_id + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_id='" + city_id + '\'' +
                ", city_name='" + city_name + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
