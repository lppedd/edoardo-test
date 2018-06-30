package com.edoardo.test.war.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UserService;

@ApplicationScoped
@Path("users")
public class UserRestService {
	private final Logger logger;
	private final UserService userService;

	@Inject
	public UserRestService(
			final Logger logger,
			final UserService userService) {
		this.logger = logger;
		this.userService = userService;
	}

	@GET
	public List<User> allUsers() {
		logger.info("Invoking the service to retrieve the users list");
		return userService.findAllUsers();
	}
}
