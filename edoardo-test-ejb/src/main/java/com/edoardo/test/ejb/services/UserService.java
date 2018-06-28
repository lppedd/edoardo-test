package com.edoardo.test.ejb.services;

import java.util.List;

import com.edoardo.test.ejb.entities.User;

public interface UserService {
	List<User> findAllUsers();
}
