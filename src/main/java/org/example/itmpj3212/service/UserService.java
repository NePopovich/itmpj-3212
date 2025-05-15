package org.example.itmpj3212.service;

import org.example.itmpj3212.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
