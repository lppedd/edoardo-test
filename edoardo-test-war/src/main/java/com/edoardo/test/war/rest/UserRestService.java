package com.edoardo.test.war.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UserService;

@Path("/users")
public class UserRestService {
	@EJB
	private UserService userService;

	@GET
	@Path("/all")
	public List<User> all() {
		return userService.findAllUsers();
	}
}
