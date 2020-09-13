package com.springboot.cms.dao;

import com.springboot.cms.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * 角色用户持久层接口
 *
 * @author YuanhuiHo
 */
@Repository("interfaceRoleUserDao")
public interface InterfaceRoleUserDao {

    //插入角色用户桥表
    @Insert("INSERT INTO cms_role_user(role_id,user_id) VALUES(#{roleNameId},#{id})")
    void save(User user);

}
