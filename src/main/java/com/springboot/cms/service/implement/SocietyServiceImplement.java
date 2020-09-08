package com.springboot.cms.service.implement;

import com.springboot.cms.dao.InterfaceSocietyDao;
import com.springboot.cms.pojo.Society;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务逻辑层实现类
 *
 * @author XiaoXiang
 */
@Service("SocietyServiceImplement")
public class SocietyServiceImplement extends CommonServiceImplement<Society> {

    @Autowired
    private InterfaceSocietyDao interfaceSocietyDao;

    @Override
    public void save(Society society) {
        interfaceSocietyDao.save(society);
    }

    @Override
    public void update(Society society) {
        interfaceSocietyDao.update(society);
    }

    public void saveOrUpdate(Society society){
        if(society.getId()==null){
            interfaceSocietyDao.save(society);
        }else{
            interfaceSocietyDao.update(society);
        }
    }
    @Override
    public void delete(Integer id) {
        interfaceSocietyDao.delete(id);
    }

    @Override
    public Society findById(Integer id) {
        return interfaceSocietyDao.findById(id);
    }

    @Override
    public List<Society> findAll() {
        return interfaceSocietyDao.findAll();
    }


    public List<Society> findByName(String societyName) {
        return interfaceSocietyDao.findByName(societyName);
    }
}
