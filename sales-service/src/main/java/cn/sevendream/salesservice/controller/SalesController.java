package cn.sevendream.salesservice.controller;

import cn.sevendream.domain.User;
import cn.sevendream.salesservice.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @AUTHOR zhangxue9
 * @DATE 2021/6/7 11:04
 */
@RestController
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private UserFeign userFeign;

    @GetMapping("getUserDetailsById")
    public User getUserDetailsById(@RequestParam("id") int id){
         return  userFeign.getUserDetailsById(id);
    }
}
