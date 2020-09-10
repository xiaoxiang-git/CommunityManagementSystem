package com.springboot.cms.controller;

import com.springboot.cms.model.Message;
import com.springboot.cms.pojo.Society;
import com.springboot.cms.service.InterfaceCommonService;
import com.springboot.cms.service.implement.SocietyServiceImplement;
import com.springboot.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 社团表现层控制器
 *
 * @author XiaoXiang
 */
@RestController
@RequestMapping("/society")
@Api(tags = "社团相关接口")
public class SocietyController {

    @Resource(name = "societyServiceImplement")
    private SocietyServiceImplement societyServiceImplement;

    //保存或更新社团
    @PostMapping("/saveOrUpdateSociety")
    @ApiOperation("新增或更新社团")
    public Message<String> saveOrUpdateSociety(Society society) {
        List<Society> list = societyServiceImplement.findByName(society.getSocietyName());
        if (list.isEmpty()) {
            societyServiceImplement.saveOrUpdate(society);
            if (society.getId() == null) {
                return MessageUtil.success("新增社团成功");
            } else {
                return MessageUtil.success("更新社团成功");
            }
        } else {
            return MessageUtil.failure("该社团名已存在");
        }
    }

    //删除社团
    @GetMapping("/deleteSociety")
    @ApiOperation("删除社团")
    public Message<String> deleteSociety(Integer id) {
        if (societyServiceImplement.findById(id) == null) {
            return MessageUtil.failure("不存在该社团");
        }
        societyServiceImplement.delete(id);
        return MessageUtil.success("删除成功");
    }

    //查找所有社团
    @GetMapping("/findAll")
    @ApiOperation("查找所有社团")
    public Message<List<Society>> findAll() {
        List<Society> societies = societyServiceImplement.findAll();
        return MessageUtil.success(societies);
    }

    //根据社团id查找社团
    @GetMapping("/findSocietyById")
    @ApiOperation("根据社团id查找社团")
    public Message<Society> findSocietyById(Integer id) {
        Society society = societyServiceImplement.findById(id);
        if (society == null) {
            return MessageUtil.failure(society);
        }
        return MessageUtil.success(society);
    }
}
