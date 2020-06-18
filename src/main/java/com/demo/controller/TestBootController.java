package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@EnableAutoConfiguration
@RequestMapping("demo/test")
public class TestBootController {
    private static final Logger logger = LoggerFactory.getLogger(TestBootController.class);

    @Resource
    private UserService userService;

    /*参数：(区分大小写，get请求里需要设置   userId:1)
    * userId:用户的id
    *
    * */
    @GetMapping("/user/get")
    public User getUserById(int userId){

        logger.info("getuser访问成功");
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

    @GetMapping("/user/getallusers")
    public List<User> getAllUsers(){


        return userService.getAllUsers();
    }





}