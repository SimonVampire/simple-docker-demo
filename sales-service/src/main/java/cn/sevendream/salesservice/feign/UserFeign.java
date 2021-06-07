package cn.sevendream.salesservice.feign;

import cn.sevendream.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description
 * @AUTHOR zhangxue9
 * @DATE 2021/6/7 10:58
 */
@FeignClient(name = "user-service",path = "/user")
public interface UserFeign {
    @GetMapping("getUserDetailsById")
    User getUserDetailsById(@RequestParam("id") int id);
}
