package com.springboot.cms.service.implement;

import com.springboot.cms.service.InterfaceCommonService;

import java.util.List;

/**
 * 业务逻辑层通用实现类
 * 抽象类
 *
 * @author YuanhuiHo
 */
public abstract class CommonServiceImplement<T> implements InterfaceCommonService<T> {

    //保存
    @Override
    public void save(T t) {

    }

    //更新
    @Override
    public void update(T t) {

    }

    //删除
    @Override
    public void delete(Integer id) {

    }

    //根据ID查找
    @Override
    public T findById(Integer id) {
        return null;
    }

    //根据条件查找
    @Override
    public List<T> findByConditions(String... conditions) {
        return null;
    }

    //查找所有
    @Override
    public List<T> findAll() {
        return null;
    }
}
