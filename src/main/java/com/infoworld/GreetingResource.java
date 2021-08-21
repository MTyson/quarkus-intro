package com.infoworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.inject.Inject;
import com.infoworld.service.MyService;
import com.infoworld.client.SwapiClient;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class GreetingResource {
    @Inject 
    MyService myService;

    @Inject
    @RestClient
    SwapiClient swapiClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
       // return "Welcome to the machine.  Your number is: " + swapiClient.getByName("Greece").iterator().next().name;
       return "Hello, your Star Wars character is: " + swapiClient.getById(myService.getRandom()).name;
    }
}
