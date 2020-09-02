package com.springboot.cms.service.implement;

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

    //保存用户
    @Override
    public void save(User user) {
        interfaceUserDao.save(user);
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
        return interfaceUserDao.findByConditions(conditions);
    }

    //查找所有用户
    @Override
    public List<User> findAll() {
        return interfaceUserDao.findAll();
    }
}
