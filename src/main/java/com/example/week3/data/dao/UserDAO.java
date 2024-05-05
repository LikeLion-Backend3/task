package com.example.week3.data.dao;

import com.example.week3.data.entity.BabyLion;
import com.example.week3.data.entity.User;

public interface UserDAO {
    User insertUser(User user);
    User selectUser(String email) throws Exception;
    User updateUser(String email, String name) throws Exception;
    void deleteUser(String email) throws Exception;
}
