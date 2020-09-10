package com.springboot.cms.service.implement;

import com.springboot.cms.dao.InterfaceSocietyDao;
import com.springboot.cms.pojo.Society;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 社团业务逻辑层实现类
 *
 * @author XiaoXiang
 */
@Service("societyServiceImplement")
public class SocietyServiceImplement extends CommonServiceImplement<Society> {

    @Autowired
    private InterfaceSocietyDao interfaceSocietyDao;

    //保存社团
    @Override
    public void save(Society society) {
        interfaceSocietyDao.save(society);
    }

    //更新社团
    @Override
    public void update(Society society) {
        interfaceSocietyDao.update(society);
    }

    //保存或更新社团
    public void saveOrUpdate(Society society) {
        if (society.getId() == null) {
            interfaceSocietyDao.save(society);
        } else {
            interfaceSocietyDao.update(society);
        }
    }

    //删除社团
    @Override
    public void delete(Integer id) {
        interfaceSocietyDao.delete(id);
    }

    //根据社团id查找社团
    @Override
    public Society findById(Integer id) {
        return interfaceSocietyDao.findById(id);
    }

    //查找所有社团
    @Override
    public List<Society> findAll() {
        return interfaceSocietyDao.findAll();
    }

    //根据社团名称查找社团
    public List<Society> findByName(String societyName) {
        return interfaceSocietyDao.findByName(societyName);
    }
}
