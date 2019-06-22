package com.instamina.study.springmvc.demo.service;

import com.instamina.study.springmvc.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> listAll();
    User getUserById(int id);
    void deleteById(int id);
    void save(User user);
    void update(User user);
}
