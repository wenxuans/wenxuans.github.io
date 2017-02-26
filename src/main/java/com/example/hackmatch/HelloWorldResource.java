package com.example.hackmatch;

//import com.example.hackmatch.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    public HelloWorldResource() {
	
    }
    @POST
    public Greeting sayHello() {
	return new Greeting();
    }
}
