package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
@RequestMapping("demo/test")
public class TestBootController {

    @Resource
    private UserService userService;

    /*参数：(区分大小写，get请求里需要设置   userId:1)
    * userId:用户的id
    *
    * */
    @GetMapping("/user/get")
    public User getUserById(int userId){


        return userService.getUserById(userId);
    }

    @PostMapping("/user/add")
    public String addUser(User user){
        return userService.addUser(user);
    }

    @PutMapping("/user/update")
    public String updateUser(User user){
        return userService.updateUser(user);
    }


    @DeleteMapping("/user/delete")
    public String deleteUser(int userId){
        return userService.deleteUserById(userId);
    }




}