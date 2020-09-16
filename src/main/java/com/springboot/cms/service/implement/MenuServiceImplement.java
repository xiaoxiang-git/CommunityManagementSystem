package com.springboot.cms.service.implement;

import com.springboot.cms.dao.InterfaceMenuDao;
import com.springboot.cms.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 菜单业务逻辑层实现类
 *
 * @author YuanhuiHo
 */
@Service("menuServiceImplement")
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImplement extends CommonServiceImplement<Menu> {

    @Autowired
    private InterfaceMenuDao interfaceMenuDao;

    //查找所有菜单
    @Override
    public List<Menu> findAll() {
        LinkedHashSet<Menu> linkedHashSet = interfaceMenuDao.findAll();
        List<Menu> menus = new LinkedList<>();
        //LinkedHashSet转LinkedList
        menus.addAll(linkedHashSet);
        return menus;
    }
}
