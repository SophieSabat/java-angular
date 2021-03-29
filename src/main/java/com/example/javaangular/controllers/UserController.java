package com.example.javaangular.controllers;

import com.example.javaangular.models.User;
import com.example.javaangular.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"})
public class UserController {

    private UserService userService;

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getOne(id);
    }
}
