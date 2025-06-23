package com.example.graphql.demo.controller;

import com.example.graphql.demo.model.User;
import com.example.graphql.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphQLController {

    @Autowired
    private UserRepository userRepository;

    @QueryMapping
    public List<User> users() {
        return userRepository.findAll();
    }

    @MutationMapping
    public User addUser(@Argument String name, @Argument String email, @Argument int age) {
        return userRepository.save(new User(null, name, email, age));
    }
}
