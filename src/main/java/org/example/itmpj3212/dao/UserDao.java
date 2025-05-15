package org.example.itmpj3212.dao;

import org.example.itmpj3212.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}
