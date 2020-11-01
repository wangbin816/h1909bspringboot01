package cn.jiyun.controller;

import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    UserService userService;
    //123123
    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }
}
