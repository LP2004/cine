package com.cine.cine.service;

import org.springframework.stereotype.Service;

import com.cine.cine.entities.User;

@Service
public interface UserService {

        public Iterable<User> getAllUsers();
    }
    

