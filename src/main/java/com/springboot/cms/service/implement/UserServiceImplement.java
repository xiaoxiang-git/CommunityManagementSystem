package com.springboot.cms.service.implement;

import com.springboot.cms.dao.InterfaceUserDao;
import com.springboot.cms.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="userServiceImplement")
public class UserServiceImplement extends CommonServiceImplement<User> {

    @Resource(name="interfaceUserDao")
    private InterfaceUserDao interfaceUserDao;

    @Override
    public void save(User user) {
        interfaceUserDao.save(user);
    }

    @Override
    public void update(User user) {
        interfaceUserDao.update(user);
    }

    @Override
    public void delete(Integer id) {
        interfaceUserDao.delete(id);
    }

    @Override
    public User findById(Integer id) {
        return interfaceUserDao.findById(id);
    }

    @Override
    public List<User> findByConditions(String... conditions) {
        return interfaceUserDao.findByConditions(conditions);
    }

    @Override
    public List<User> findAll() {
        return interfaceUserDao.findAll();
    }
}
