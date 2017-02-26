package com.example.hackmatch;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.TEXT_HTML)
public class HelloWorldResource {

    public HelloWorldResource() {
	
    }
    @GET
    public Response sayHello() {
	return Response.ok("hello").build();
    }
}
