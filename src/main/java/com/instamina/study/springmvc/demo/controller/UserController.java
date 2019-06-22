package com.instamina.study.springmvc.demo.controller;

import com.instamina.study.springmvc.demo.entity.User;
import com.instamina.study.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<User> listAll(){
        return userService.listAll();
    }
    @RequestMapping(value = "/getUserById/{id}")
    @ResponseBody
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @RequestMapping(value = "/deleteById",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteById(@RequestParam int id){
        userService.deleteById(id);
        return "success";
    }
    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user){
        userService.save(user);
        return "success";
    }
    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user,@PathVariable(name = "id") int dd){
        user.setId(dd);
        userService.update(user);
        return "success";
    }
}
