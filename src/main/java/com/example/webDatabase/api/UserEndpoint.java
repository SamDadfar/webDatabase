package com.example.webDatabase.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.webDatabase.controller.UserService;
import com.example.webDatabase.domain.User;
@Path("user")
@Component
public class UserEndpoint {
	
	@Autowired
	private UserService userService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <User> users = userService.findAll();
		return Response.ok(users).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postTrein(User user){
		User result = userService.save(user);
		return Response.accepted(result.getId()).build();	
	}

}
