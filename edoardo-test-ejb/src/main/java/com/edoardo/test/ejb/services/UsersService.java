package com.edoardo.test.ejb.services;

import com.edoardo.test.ejb.entities.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UsersService {
	List<User> findAllUsers();
}
