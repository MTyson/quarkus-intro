package com.infoworld.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Set;

//@Path("/v2")
@RegisterRestClient
public interface SwapiClient {
    @GET
    @Path("/people/{id}")
    @Produces("application/json")
    Person getById(@PathParam Integer id);
}
