package com.edoardo.test.ejb.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UserService;

@Stateless
public class UserServiceImpl implements UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
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
