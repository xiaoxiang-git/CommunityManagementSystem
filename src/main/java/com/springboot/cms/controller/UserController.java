package com.springboot.cms.controller;

import com.springboot.cms.pojo.User;
import com.springboot.cms.service.InterfaceCommonService;
import com.springboot.cms.model.Message;
import com.springboot.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户表现层控制器
 *
 * @author YuanhuiHo/xiaoxiang
 */
@RestController
@RequestMapping("/user")
@Api(tags = {"用户相关处理器"})
public class UserController {

    @Resource(name = "userServiceImplement")
    private InterfaceCommonService interfaceCommonService;

    //用户登录
    @PostMapping("/login")
    @ApiOperation("登录功能")
    public Message<String> login(User user, HttpServletRequest httpServletRequest) {
        System.out.println("user:"+user);
        List<User> users = interfaceCommonService.findByConditions(user.getName());
        System.out.println("users:"+users);
        if (users.isEmpty()) {
            return MessageUtil.failure("用户名或密码错误");
        }
        httpServletRequest.getSession().setAttribute("user", users.get(0));
        return MessageUtil.success("登录成功");
    }

    //用户注册
    @PostMapping("/register")
    @ApiOperation("注册功能")
    public Message<String> register(User user) {
        List<User> users = interfaceCommonService.findByConditions(user.getName());
        if (!users.isEmpty()) {
            return MessageUtil.failure("该用户名已存在");
        }
        interfaceCommonService.save(user);
        return MessageUtil.success("注册成功");
    }

    //用户登出
    @GetMapping("/logout")
    @ApiOperation("登出功能")
    public Message<String> logout(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().removeAttribute("user");
        return MessageUtil.success("登出成功");
    }
}
