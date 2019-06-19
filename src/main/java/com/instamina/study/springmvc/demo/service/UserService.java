package com.instamina.study.springmvc.demo.service;

import com.instamina.study.springmvc.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();
    User queryById(int id);
}
