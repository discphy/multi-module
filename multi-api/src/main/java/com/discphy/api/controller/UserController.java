package com.discphy.api.controller;

import com.discphy.core.entity.User;
import com.discphy.core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return user;
    }
}
