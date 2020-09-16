package com.springboot.cms.dao;

import com.springboot.cms.pojo.Menu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashSet;

/**
 * 菜单持久层接口
 *
 * @author YuanhuiHo
 */
@Repository("interfaceMenuDao")
public interface InterfaceMenuDao {

    //查找所有菜单
    @Select("SELECT cms_firstlevelmenus.id,cms_firstlevelmenus.name,cms_secondlevelmenus.id,cms_secondlevelmenus.name,firstlevelmenu_id FROM cms_firstlevelmenus LEFT JOIN cms_secondlevelmenus ON cms_firstlevelmenus.id=firstlevelmenu_id")
    LinkedHashSet<Menu> findAll();

}
