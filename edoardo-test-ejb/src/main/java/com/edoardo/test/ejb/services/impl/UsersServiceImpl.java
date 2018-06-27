package com.edoardo.test.ejb.services.impl;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Stateless(name = "UserService")
public class UsersServiceImpl implements UsersService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);
	
	public List<User> findAllUsers() {
		LOGGER.debug("Retrieving the users list");
		
		final User user = new User();
		user.id = UUID.randomUUID().toString();
		user.name = "Edoardo";
		user.name = "Luppi";
		user.email = "lp.edoardo@gmail.com";
		
		final User user2 = new User();
		user2.id = UUID.randomUUID().toString();
		user2.name = "Marco";
		user2.name = "Rossi";
		user2.email = "marco.rossi@gmail.com";
		
		return Arrays.asList(user, user2);
	}
}
