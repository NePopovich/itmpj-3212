package org.example.itmpj3212.controller;


import org.example.itmpj3212.model.User;
import org.example.itmpj3212.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController() {
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String viewAllUsers(ModelMap model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "user";
    }
}
