package com.cine.cine.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cine.cine.entities.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long> {

 }