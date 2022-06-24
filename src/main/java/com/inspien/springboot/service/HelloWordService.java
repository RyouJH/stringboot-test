package com.inspien.springboot.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.inspien.springboot.pilot.IONTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Component
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWordService {
	@Autowired
	private IONTest test;

	@Context
	private HttpServletRequest request;

	@Context
	private ApplicationContext context;

	@GET
	@Path("hello-world")
	public RestResult helloWorld() {
		return RestResult.ok();
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private static class RestResult {
		public boolean success;
		public String message;

		public static RestResult ok() {
			RestResult r = new RestResult();
			r.success = true;
			return r;
		}
	}
}
