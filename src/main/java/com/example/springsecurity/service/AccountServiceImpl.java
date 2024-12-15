package com.example.springsecurity.service;

import com.example.springsecurity.entities.User;
import com.example.springsecurity.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User loadUserByUsername(String username) {
        return  userRepository.findByUsername(username) ;
    }
}
