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

    public List<User> listAll(){
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserDao userDao = session.getMapper(UserDao.class);
            return userDao.listAll();
        } finally {
            session.close();
        }

    }
    public User getUserById(int id){
        SqlSession session = sqlSessionFactory.openSession();
        try{
            UserDao userDao = session.getMapper(UserDao.class);
            return userDao.getUserById(id);
        } finally{
            session.close();
        }
    }

    @Override
    public void deleteById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        try{
            UserDao userDao = session.getMapper(UserDao.class);
            userDao.deleteById(id);
        }finally{
            session.close();
        }

    }

    @Override
    public void save(User user) {
        SqlSession session = sqlSessionFactory.openSession();
        try{
            UserDao userDao = session.getMapper(UserDao.class);
            userDao.save(user);
        }finally{
            session.close();
        }

    }

    @Override
    public void update(User user) {
        SqlSession session = sqlSessionFactory.openSession();
        try{
            UserDao userDao = session.getMapper(UserDao.class);
            userDao.update(user);
        }finally{
            session.close();
        }
    }
}
