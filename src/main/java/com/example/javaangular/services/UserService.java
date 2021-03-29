package com.example.javaangular.services;

import com.example.javaangular.models.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();

    User getOne(@PathVariable int id);
}
