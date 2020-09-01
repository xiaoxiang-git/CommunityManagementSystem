package com.springboot.cms.controller;

import com.springboot.cms.pojo.User;
import com.springboot.cms.util.CommunityManagementSystemException;
import com.springboot.cms.util.Message;
import com.springboot.cms.util.MessageUtil;
import com.springboot.cms.util.StatusCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关信息的controller  测试接口
 *
 * @author xiaoxiang
 */
@RestController
@RequestMapping("/user")
@Api(tags = {"与用户相关的接口"})
public class UserController {

    @PostMapping("/Test")
    @ApiOperation("测试")
    public Message<User> Test() {
        try {
            int a = 1 / 0;
            return MessageUtil.success(new User());
        } catch (CommunityManagementSystemException e) {
            return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误：" + e.getMessage());
        }
    }
}
