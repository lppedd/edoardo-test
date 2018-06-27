package com.edoardo.test.war.rest;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UsersService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("users")
public class UserRestService {
	@Inject
	private UsersService usersService;
	
	@GET
	@Path("all")
	public List<User> all() {
		return usersService.findAllUsers();
	}
}
