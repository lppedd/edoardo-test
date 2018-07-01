package com.edoardo.test.war.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UserService;

@ApplicationScoped
@Path("users")
public class UserRestService {
	@Inject
	private Logger logger;

	@Inject
	private UserService userService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> allUsers() {
		logger.info("Invoking the service to retrieve the users list");
		return userService.findAllUsers();
	}
}
