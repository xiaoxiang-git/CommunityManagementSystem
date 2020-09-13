package com.springboot.cms.service.implement;

import com.springboot.cms.dao.InterfaceRoleUserDao;
import com.springboot.cms.dao.InterfaceUserDao;
import com.springboot.cms.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户业务逻辑层实现类
 *
 * @author YuanhuiHo
 */
@Service("userServiceImplement")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImplement extends CommonServiceImplement<User> {

    @Autowired
    private InterfaceUserDao interfaceUserDao;
    @Autowired
    private InterfaceRoleUserDao interfaceRoleUserDao;

    //保存用户
    @Override
    public void save(User user) {
        interfaceUserDao.save(user);
        //获取保存用户后主键id
        user = (User) interfaceUserDao.findByConditions(user.getName());
        //插入角色用户桥表
        interfaceRoleUserDao.save(user);
    }

    //更新用户
    @Override
    public void update(User user) {
        interfaceUserDao.update(user);
    }

    //删除用户
    @Override
    public void delete(Integer id) {
        interfaceUserDao.delete(id);
    }

    //根据用户ID查找用户
    @Override
    public User findById(Integer id) {
        return interfaceUserDao.findById(id);
    }

    //根据条件查找用户
    @Override
    public List<User> findByConditions(String... conditions) {
        return interfaceUserDao.findByConditions(conditions[0]);
    }

    //查找所有用户
    @Override
    public List<User> findAll() {
        return interfaceUserDao.findAll();
    }
}
