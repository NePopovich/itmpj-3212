package org.example.itmpj3212.service;


import org.example.itmpj3212.dao.UserDao;
import org.example.itmpj3212.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserDao userDao;

    public UserService() {
    }

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public User getById(Long id) {
        return userDao.findById(id).orElseThrow();
    }

    public List<User> getAllUser() {
        return userDao.findAll();
    }

}
