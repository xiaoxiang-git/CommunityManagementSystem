package com.springboot.cms.dao;

import com.springboot.cms.pojo.Menu;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 菜单持久层接口
 *
 * @author YuanhuiHo
 */
@Repository("interfaceMenuDao")
public interface InterfaceMenuDao {

    //查找所有一级菜单
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "id", property = "menus",
                    many = @Many(select = "com.springboot.cms.dao.InterfaceMenuDao.findAllSecondLevelMenu",
                            fetchType = FetchType.EAGER))
    })
    @Select("SELECT id,name FROM cms_firstlevelmenus")
    LinkedHashSet<Menu> findAllFirstLevelMenu();

    //查找所有二级菜单
    @Select("SELECT id,name,firstlevelmenu_id FROM cms_secondlevelmenus WHERE firstlevelmenu_id=#{firstLevelMenu_id}")
    Set<Menu> findAllSecondLevelMenu(Integer firstLevelMenu_id);

}
