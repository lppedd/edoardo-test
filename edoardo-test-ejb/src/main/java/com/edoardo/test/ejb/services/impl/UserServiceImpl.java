package com.edoardo.test.ejb.services.impl;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

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
		edoardo.id = 1;
		edoardo.name = "Edoardo";
		edoardo.surname = "Luppi";
		edoardo.birthday = new GregorianCalendar(1994, 11, 5).getTime();

		final User marco = new User();
		marco.id = 2;
		marco.name = "Marco";
		marco.surname = "Rossi";
		marco.birthday = new GregorianCalendar(1990, 4, 12).getTime();

		return Arrays.asList(edoardo, marco);
	}
}
