package com.example.webDatabase.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.webDatabase.api.BookEndpoint;
import com.example.webDatabase.api.UserEndpoint;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(BookEndpoint.class);
		register(UserEndpoint.class);
	}
}
