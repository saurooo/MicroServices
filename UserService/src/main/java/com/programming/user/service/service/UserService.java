package com.programming.user.service.service;

import com.programming.user.service.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);

}
