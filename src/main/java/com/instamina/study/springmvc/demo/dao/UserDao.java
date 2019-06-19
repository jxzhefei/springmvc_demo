package com.instamina.study.springmvc.demo.dao;

import com.instamina.study.springmvc.demo.entity.User;

import java.util.List;
public interface UserDao {
    List<User> queryAll();
    User queryById(int id);
}
