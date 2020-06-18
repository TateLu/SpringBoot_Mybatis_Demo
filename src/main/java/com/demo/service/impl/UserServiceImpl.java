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
        try {
            return userDao.selectByPrimaryKey(userId);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

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

    @Override
    public String updateUser(User record) {

        try {
            userDao.updateByPrimaryKey(record);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "failure";
    }

    @Override
    public String deleteUserById(int userId) {

        try {
            userDao.deleteByPrimaryKey(userId);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "failure";

    }

    @Override
    public List<User> getAllUsers() {
        try {
            return userDao.selectAllUsers();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}