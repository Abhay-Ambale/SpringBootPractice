package com.webapp.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.webapp.main.entities.User;
public interface UserRepo extends CrudRepository<User, Integer> {

}
