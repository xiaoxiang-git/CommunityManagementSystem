package com.springboot.cms.pojo;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * 用户实体类
 *
 * @author YuanhuiHo
 */
public class User implements Serializable {

    private Integer id;
    private String name;
    private String password;
    private String identityId;
    private Integer companyNameId;
    private Integer roleNameId;
    private String status;
    private Integer isBan;
    private String sex;
    private String phone;
    private String email;
    private String qq;
    private String userPhoto;

    //关联角色
    private Set<Role> roles;

    public User() {
    }

    public User(Integer id, String name, String password, String identityId, Integer companyNameId, Integer roleNameId, String status, Integer isBan, String sex, String phone, String email, String qq, String userPhoto, Set<Role> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.identityId = identityId;
        this.companyNameId = companyNameId;
        this.roleNameId = roleNameId;
        this.status = status;
        this.isBan = isBan;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.qq = qq;
        this.userPhoto = userPhoto;
        this.roles = roles;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public Integer getCompanyNameId() {
        return companyNameId;
    }

    public void setCompanyNameId(Integer companyNameId) {
        this.companyNameId = companyNameId;
    }

    public Integer getRoleNameId() {
        return roleNameId;
    }

    public void setRoleNameId(Integer roleNameId) {
        this.roleNameId = roleNameId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIsBan() {
        return isBan;
    }

    public void setIsBan(Integer isBan) {
        this.isBan = isBan;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(identityId, user.identityId) &&
                Objects.equals(companyNameId, user.companyNameId) &&
                Objects.equals(roleNameId, user.roleNameId) &&
                Objects.equals(status, user.status) &&
                Objects.equals(isBan, user.isBan) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(email, user.email) &&
                Objects.equals(qq, user.qq) &&
                Objects.equals(userPhoto, user.userPhoto) &&
                Objects.equals(roles, user.roles);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, password, identityId, companyNameId, roleNameId, status, isBan, sex, phone, email, qq, userPhoto, roles);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", identityId='" + identityId + '\'' +
                ", companyNameId=" + companyNameId +
                ", roleNameId=" + roleNameId +
                ", status='" + status + '\'' +
                ", isBan=" + isBan +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", roles=" + roles +
                '}';
    }
}
