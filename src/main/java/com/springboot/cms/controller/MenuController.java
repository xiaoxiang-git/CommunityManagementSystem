package com.springboot.cms.controller;

import com.springboot.cms.model.Message;
import com.springboot.cms.pojo.Menu;
import com.springboot.cms.service.InterfaceCommonService;
import com.springboot.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单表现层控制器
 *
 * @author YuanhuiHo
 */
@RestController
@RequestMapping("/menu")
@Api(tags = {"菜单相关处理器"})
public class MenuController {

    @Resource(name = "menuServiceImplement")
    private InterfaceCommonService interfaceCommonService;

    //查找所有菜单
    @GetMapping("/findAllMenu")
    @ApiOperation("查找所有菜单")
    public Message<List<Menu>> findAllMenu() {
        List<Menu> menus = interfaceCommonService.findAll();
        return MessageUtil.success(menus);
    }
}
