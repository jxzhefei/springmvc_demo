package com.instamina.study.springmvc.demo.service.impl;

import com.instamina.study.springmvc.demo.dao.UserDao;
import com.instamina.study.springmvc.demo.entity.User;
import com.instamina.study.springmvc.demo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    public List<User> queryAll(){
        SqlSession session = sqlSessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        return userDao.queryAll();
    }
    public User queryById(int id){
        SqlSession session = sqlSessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        return userDao.queryById(id);
    }
}
