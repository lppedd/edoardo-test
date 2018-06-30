package com.edoardo.test.ejb.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UserService;

@Stateless
public class UserServiceImpl implements UserService {
	@Inject
	private Logger logger;

	@Override
	public List<User> findAllUsers() {
		logger.info("Retrieving the users list");

		final User edoardo = new User();
		edoardo.id = UUID.randomUUID().toString();
		edoardo.name = "Edoardo";
		edoardo.surname = "Luppi";
		edoardo.email = "lp.edoardo@gmail.com";

		final User marco = new User();
		marco.id = UUID.randomUUID().toString();
		marco.name = "Marco";
		marco.surname = "Rossi";
		marco.email = "marco.rossi@gmail.com";

		return Arrays.asList(edoardo, marco);
	}
}
