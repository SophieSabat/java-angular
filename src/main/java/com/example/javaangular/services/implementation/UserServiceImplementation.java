package com.example.javaangular.services.implementation;

import com.example.javaangular.dao.UserDAO;
import com.example.javaangular.models.User;
import com.example.javaangular.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {

    private UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User getOne(int id) {
        return userDAO.getUser(id);
    }
}
