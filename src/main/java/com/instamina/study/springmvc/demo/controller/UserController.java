package com.instamina.study.springmvc.demo.controller;

import com.instamina.study.springmvc.demo.entity.User;
import com.instamina.study.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(){
        System.out.println("hello world!");
        return "hello world!";
    }
    @RequestMapping(value = "/queryAll")
    @ResponseBody
    public List<User> queryAll(){
        return userService.queryAll();
    }
    @RequestMapping(value = "/queryById/{id}")
    @ResponseBody
    public User queryById(@PathVariable int id){
        return userService.queryById(id);
    }
}
