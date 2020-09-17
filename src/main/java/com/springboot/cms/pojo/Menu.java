package com.springboot.cms.pojo;

import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * 菜单实体类
 * 一级菜单
 * 二级菜单
 *
 * @author YuanhuiHo
 */
public class Menu implements Serializable {

    @ApiParam("主键id")
    private Integer id;
    @ApiParam("一级菜单名称/二级菜单名称")
    private String name;
    @ApiParam("一级菜单id")
    private Integer firstLevelMenu_id;

    @ApiParam("二级菜单集合")
    //关联二级菜单
    private LinkedHashSet<Menu> menus;

    public Menu() {
    }

    public Menu(Integer id, String name, Integer firstLevelMenu_id, LinkedHashSet<Menu> menus) {
        this.id = id;
        this.name = name;
        this.firstLevelMenu_id = firstLevelMenu_id;
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstLevelMenu_id() {
        return firstLevelMenu_id;
    }

    public void setFirstLevelMenu_id(Integer firstLevelMenu_id) {
        this.firstLevelMenu_id = firstLevelMenu_id;
    }

    public LinkedHashSet<Menu> getMenus() {
        return menus;
    }

    public void setMenus(LinkedHashSet<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id) &&
                Objects.equals(name, menu.name) &&
                Objects.equals(firstLevelMenu_id, menu.firstLevelMenu_id) &&
                Objects.equals(menus, menu.menus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, firstLevelMenu_id, menus);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstLevelMenu_id=" + firstLevelMenu_id +
                ", menus=" + menus +
                '}';
    }
}
