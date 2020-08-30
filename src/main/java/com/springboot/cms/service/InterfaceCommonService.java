package com.springboot.cms.service;

import java.util.List;

/**
 * 业务逻辑层通用接口
 *
 * @author YuanhuiHo
 */
public interface InterfaceCommonService<T> {

    //保存
    void save(T t);

    //更新
    void update(T t);

    //删除
    void delete(Integer id);

    //根据ID查找
    T findById(Integer id);

    //根据条件查找
    List<T> findByConditions(String... conditions);

    //查找所有
    List<T> findAll();

}
