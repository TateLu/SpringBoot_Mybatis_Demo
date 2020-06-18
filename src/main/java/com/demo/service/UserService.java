package com.demo.service;

import com.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User getUserById(int userId);

    String addUser(User record);

    String updateUser(User record);

    String deleteUserById(int userId);

    List<User> getAllUsers();

}