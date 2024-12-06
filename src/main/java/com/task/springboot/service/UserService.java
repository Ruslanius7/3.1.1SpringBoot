package com.task.springboot.service;


import com.task.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long Id);
    void updateUser(User user);
}
