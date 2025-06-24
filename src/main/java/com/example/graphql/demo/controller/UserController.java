package com.example.graphql.demo.controller;

import com.example.graphql.demo.model.User;
import com.example.graphql.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @QueryMapping
    public List<User> users() {
        return userRepository.findAll();
    }
}
