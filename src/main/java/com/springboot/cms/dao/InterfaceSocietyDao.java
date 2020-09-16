package com.springboot.cms.dao;

import com.springboot.cms.pojo.Society;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 社团持久层接口
 *
 * @author XiaoXiang
 */
@Repository("interfaceSocietyDao")
public interface InterfaceSocietyDao {
    //新建社团
    @Insert("INSERT INTO cms_societies(societyName,creationTime,establishTime,introduction,societyDetails,source,status,music,video,societyNature,founder,societyPersonnelTotal,totalFunds,usedFunds)" +
            " VALUES(#{societyName},#{creationTime},#{establishTime},#{introduction},#{societyDetails},#{source},#{status},#{music},#{video},#{societyNature},#{founder},#{societyPersonnelTotal},#{totalFunds},#{usedFunds})")
    void save(Society society);

    //更新社团
    @Update("UPDATE cms_societies SET societyName=#{societyName},creationTime=#{creationTime},establishTime=#{establishTime},introduction=#{introduction},societyDetails=#{societyDetails},source=#{source},status=#{status},music=#{music},video=#{video},societyNature=#{societyNature},founder=#{founder},societyPersonnelTotal=#{societyPersonnelTotal},totalFunds=#{totalFunds},usedFunds=#{usedFunds} WHERE id=#{id}")
    void update(Society society);

    //删除社团
    @Delete("DELETE FROM cms_societies WHERE id=#{id}")
    void delete(Integer id);

    //根据社团ID查询社团
    @Select("SELECT id,societyName,creationTime,establishTime,introduction,societyDetails,source,status,music,video,societyNature,founder,societyPersonnelTotal,totalFunds,usedFunds FROM cms_societies WHERE id=#{id}")
    Society findById(Integer id);

    //根据社团名称查询社团
    @Select("SELECT id,societyName,creationTime,establishTime,introduction,societyDetails,source,status,music,video,societyNature,founder,societyPersonnelTotal,totalFunds,usedFunds FROM cms_societies WHERE societyName=#{societyName}")
    List<Society> findByName(String societyName);

    //查找所有社团
    @Select("SELECT id,societyName,creationTime,establishTime,introduction,societyDetails,source,status,music,video,societyNature,founder,societyPersonnelTotal,totalFunds,usedFunds FROM cms_societies")
    List<Society> findAll();
}
