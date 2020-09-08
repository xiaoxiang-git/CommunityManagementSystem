package com.springboot.cms.controller;

import com.springboot.cms.model.Message;
import com.springboot.cms.pojo.Society;
import com.springboot.cms.service.implement.SocietyServiceImplement;
import com.springboot.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表现层控制器
 *
 * @author XiaoXiang
 */


@RestController
@RequestMapping("/Society")
@Api(tags = "社团相关接口")
public class SocietyController {

    @Resource(name="SocietyServiceImplement")
    private SocietyServiceImplement societyServiceImplement;

    @PostMapping("/AddOrUpdateSociety")
    @ApiOperation("新增或更新社团")
    public Message<String> AddOrUpdateSociety(Society society){
        List<Society> list = societyServiceImplement.findByName(society.getSocietyName());
        if(list.get(0)==null) {
            societyServiceImplement.saveOrUpdate(society);
            if (society.getId() == null) {
                return MessageUtil.success("添加成功");
            } else {
                return MessageUtil.success("更新成功");
            }
        }else{
            return MessageUtil.failure("已有该社团名");
        }
    }

    @PostMapping("/DeleteSocietyById")
    @ApiOperation("删除社团")
    public Message<String> AddSociety(Integer id){
        if(societyServiceImplement.findById(id)==null){
            return MessageUtil.failure("不存在该社团id");
        }
        societyServiceImplement.delete(id);
        return MessageUtil.success("删除成功");
    }


    @GetMapping("/FindAllSociety")
    @ApiOperation("查找所有社团")
    public Message<List<Society>> FindAllSociety(){
        List<Society> societies = societyServiceImplement.findAll();
        return MessageUtil.success(societies);
    }

    @GetMapping("/FindSocietyById")
    @ApiOperation("根据社团id查找社团")
    public Message<Society> FindSocietyById(Integer id){
        Society society = societyServiceImplement.findById(id);
        if(society==null){
            return MessageUtil.failure(society);
        }
        return MessageUtil.success(society);
    }
}
