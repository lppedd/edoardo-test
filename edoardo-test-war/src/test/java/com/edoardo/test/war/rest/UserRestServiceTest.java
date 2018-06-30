package com.edoardo.test.war.rest;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;

import com.edoardo.test.ejb.entities.User;
import com.edoardo.test.ejb.services.UserService;

@SuppressWarnings("AnonymousInnerClassMayBeStatic")
@RunWith(MockitoJUnitRunner.class)
public class UserRestServiceTest extends JerseyTest {
	@Mock
	private UserService userService;

	@Mock
	private Logger logger;

	@Test
	public void nonEmptyListTest() {
		final User user = new User();
		user.id = UUID.randomUUID().toString();
		user.name = "Test name";
		user.surname = "Test surname";
		user.email = "Test email";

		Mockito.when(userService.findAllUsers())
				 .thenReturn(Collections.singletonList(user));

		final Response response = target("/users").request(MediaType.APPLICATION_JSON).get();
		final List<User> users = response.readEntity(new GenericType<List<User>>() {});

		Assert.assertEquals(response.getStatus(), 200);
		Assert.assertEquals(users.size(), 1);
		Assert.assertEquals(users.get(0).id, user.id);
	}

	@Test
	public void emptyListTest() {
		Mockito.when(userService.findAllUsers())
				 .thenReturn(Collections.emptyList());

		final Response response = target("/users").request(MediaType.APPLICATION_JSON).get();
		final List<User> users = response.readEntity(new GenericType<List<User>>() {});

		Assert.assertEquals(response.getStatus(), 200);
		Assert.assertTrue(users.isEmpty());
	}

	@Test
	public void nullListTest() {
		Mockito.when(userService.findAllUsers())
				 .thenReturn(null);

		final Response response = target("/users").request(MediaType.APPLICATION_JSON).get();
		final List<User> users = response.readEntity(new GenericType<List<User>>() {});

		Assert.assertEquals(response.getStatus(), 204);
		Assert.assertNull(users);
	}

	@Override
	protected Application configure() {
		return new ResourceConfig(UserRestService.class)
				.register(new AbstractBinder() {
					@Override
					protected void configure() {
						bind(userService).to(UserService.class);
						bind(logger).to(Logger.class);
					}
				});
	}
}
