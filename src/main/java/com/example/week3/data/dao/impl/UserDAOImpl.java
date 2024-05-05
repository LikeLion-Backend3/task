package com.example.week3.data.dao.impl;

import com.example.week3.data.dao.UserDAO;
import com.example.week3.data.entity.User;
import com.example.week3.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {
    private final UserRepository userRepository;

    @Autowired
    public UserDAOImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insertUser(User user) {
        return null;
    }

    @Override
    public User selectUser(String email) throws Exception {
        return null;
    }

    @Override
    public User updateUser(String email, String name) throws Exception {
        return null;
    }

    @Override
    public void deleteUser(String email) throws Exception {

    }
}
