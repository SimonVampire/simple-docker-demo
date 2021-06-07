package cn.sevendream.userservice.controller;

import cn.sevendream.domain.User;
import cn.sevendream.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @AUTHOR zhangxue9
 * @DATE 2021/6/7 10:40
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getUserDetailsById")
    public User getUserDetailsById(@RequestParam("id") int id) {
        return  userService.getUserDetailsById(id);
    }
}
