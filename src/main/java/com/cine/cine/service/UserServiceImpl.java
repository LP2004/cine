package com.cine.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.cine.entities.User;
import com.cine.cine.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

}