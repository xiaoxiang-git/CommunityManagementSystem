package com.springboot.cms.dao;

import com.springboot.cms.pojo.Society;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 用户持久层接口
 *
 * @author XiaoXiang
 */
@Repository("InterfaceSociety")
public interface InterfaceSocietyDao {
    //新建社团
    @Insert("INSERT INTO cms_societies(societyName,creationTime,establishTime,introduction,societyDetails,source,status,music," +
            "video,societyNature,founder,societyPersonnelTotal,totalFunds,usedFunds)" +
            " VALUES(#{societyName},#{creationTime},#{establishTime},#{introduction},#{societyDetails},#{source},#{status},#{music}," +
            "#{video},#{societyNature},#{founder},#{societyPersonnelTotal},#{totalFunds},#{usedFunds})")
    void save(Society society);

    //更新社团信息
    @Update("UPDATE cms_societies SET societyName=#{societyName},creationTime=#{creationTime},establishTime=#{establishTime},introduction=#{introduction},societyDetails=#{societyDetails},source=#{source},status=#{status},music=#{music}," +
            "video=#{video},societyNature=#{societyNature},founder=#{founder},societyPersonnelTotal=#{societyPersonnelTotal},totalFunds=#{totalFunds},usedFunds=#{usedFunds} WHERE id=#{id}")
    void update(Society society);

    //查询所有社团
    @Select("SELECT * FROM cms_societies")
    List<Society> findAll();

    //查询社团id查询社团
    @Select("SELECT * FROM cms_societies WHERE id=#{id}")
    Society findById(Integer id);

    //查询社团id查询社团
    @Select("SELECT * FROM cms_societies WHERE societyName=#{societyName}")
    List<Society> findByName(String societyName);

    //删除社团
    @Delete("DELETE FROM cms_societies WHERE id=#{id}")
    void delete(Integer id);
}
