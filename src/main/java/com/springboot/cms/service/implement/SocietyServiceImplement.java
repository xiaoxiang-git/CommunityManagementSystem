package com.springboot.cms.service.implement;

import com.springboot.cms.dao.InterfaceSocietyDao;
import com.springboot.cms.pojo.Society;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 社团业务逻辑层实现类
 *
 * @author XiaoXiang
 */
@Service("societyServiceImplement")
@Transactional(rollbackFor = Exception.class)//加上rollbackFor=Exception.class,可以让事物在遇到非运行时异常时也回滚
//强迫该类事务使用CGLib代理方式而不使用JDK动态代理
//因为该类注入Controller时必须使用此实现类而不能使用接口
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
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

    //根据社团ID查找社团
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
