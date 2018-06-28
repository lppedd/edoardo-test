package com.edoardo.test.ejb.services;

import java.util.List;

import javax.ejb.Local;

import com.edoardo.test.ejb.entities.User;

@Local
public interface UserService {
	List<User> findAllUsers();
}
