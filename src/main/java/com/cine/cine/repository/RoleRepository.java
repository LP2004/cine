package com.cine.cine.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cine.cine.entities.Role;



@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

 }