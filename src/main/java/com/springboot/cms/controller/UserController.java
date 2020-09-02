package com.springboot.cms.controller;

import com.springboot.cms.pojo.User;
import com.springboot.cms.service.InterfaceCommonService;
import com.springboot.cms.util.CommunityManagementSystemException;
import com.springboot.cms.util.Message;
import com.springboot.cms.util.MessageUtil;
import com.springboot.cms.util.StatusCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户相关信息的controller  测试接口
 *
 * @author xiaoxiang
 */
@RestController
@RequestMapping("/user")
@Api(tags = {"与用户相关的接口"})
public class UserController {

    @Resource(name = "userServiceImplement")
    private InterfaceCommonService interfaceCommonService;

    @GetMapping("/login")
    @ApiOperation("测试")
    public Message<String> login(User user, HttpServletRequest httpServletRequest) {
        List<User> users = interfaceCommonService.findByConditions(user.getName());
        if (users.isEmpty()) {
            throw new CommunityManagementSystemException(StatusCodeUtil.ERROR_CODE, "用户名或密码错误");
        }
        httpServletRequest.getSession().setAttribute("user", users.get(0));
        return MessageUtil.success();
    }

    @PostMapping("/register")
    @ApiOperation("测试")
    public Message<String> register(User user) {
        interfaceCommonService.save(user);
        return MessageUtil.success();
    }

    @PostMapping("/logout")
    @ApiOperation("测试")
    public Message<String> logout(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().removeAttribute("user");
        return MessageUtil.success();
    }
}
