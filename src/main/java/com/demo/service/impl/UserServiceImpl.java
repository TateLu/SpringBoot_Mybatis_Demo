package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.entity.User;

import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;


    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public String addUser(User record){

        try {
            userDao.insert(record);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "failure";
    }

}