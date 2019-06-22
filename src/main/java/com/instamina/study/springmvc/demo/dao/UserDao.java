package com.instamina.study.springmvc.demo.dao;

import com.instamina.study.springmvc.demo.entity.User;

import java.util.List;
public interface UserDao {
    List<User> listAll();
    User getUserById(int id);
    void deleteById(int id);
    void save(User user);
    void update(User user);
}
