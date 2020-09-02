package com.springboot.cms.dao;

import com.springboot.cms.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户持久层接口
 *
 * @author YuanhuiHo
 */
@Repository("interfaceUserDao")
public interface InterfaceUserDao {

    //保存用户
    @Insert("INSERT INTO cms_users(name,password,identityId,companyNameId,roleNameId,status,isBan,sex,phone,email,qq,userPhoto) VALUES(#{name},#{password},#{identityId},#{companyNameId},#{roleNameId},#{status},#{isBan},#{sex},#{phone},#{email},#{qq},#{userPhoto})")
    void save(User user);

    //更新用户
    @Update("UPDATE cms_users SET name=#{name},password=#{password},identityId=#{identityId},companyNameId=#{companyNameId},roleNameId=#{roleNameId},status=#{status},isBan=#{isBan},sex=#{sex},phone=#{phone},email=#{email},qq=#{qq},userPhoto=#{userPhoto} WHERE id=#{id}")
    void update(User user);

    //删除用户
    @Delete("DELETE FROM cms_users WHERE id=#{id}")
    void delete(Integer id);

    //根据用户ID查找用户
    @Select("SELECT id,name,password,identityId,companyNameId,roleNameId,status,isBan,sex,phone,email,qq,userPhoto FROM cms_users WHERE id=#{id}")
    User findById(Integer id);

    //根据条件查找用户
    @Select("SELECCT id,name,password,identityId,companyNameId,roleNameId,status,isBan,sex,phone,email,qq,userPhoto FROM cms_users WHERE name=#{name}")
    List<User> findByConditions(String... conditions);

    //查找所有用户
    @Select("SELECT id,name,password,identityId,companyNameId,roleNameId,status,isBan,sex,phone,email,qq,userPhoto FROM cms_users")
    List<User> findAll();

}
