package com.example.springsecurity.service;

import com.example.springsecurity.entities.User;

public interface AccountService {

    User addNewUser (User user);
    User loadUserByUsername(String username);

}
