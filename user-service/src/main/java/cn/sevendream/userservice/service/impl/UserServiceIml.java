package cn.sevendream.userservice.service.impl;

import cn.sevendream.domain.User;
import cn.sevendream.userservice.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description
 * @AUTHOR zhangxue9
 * @DATE 2021/6/7 11:20
 */
@Service
public class UserServiceIml implements UserService {
    @Override
    public User getUserDetailsById(int id) {
        if(id ==1){
            User user = new User();
            user.setName("simon");
            user.setAge(20);
            user.setSex("M");
            return user;
        }else{
            return null;
        }

    }
}
