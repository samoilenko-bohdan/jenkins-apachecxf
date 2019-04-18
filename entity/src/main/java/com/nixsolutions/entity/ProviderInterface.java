package com.nixsolutions.entity;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/weather")
public interface ProviderInterface {

    @GET
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/zip/{zip}")
    Response getWeatherByZip(@PathParam("zip") String zip);

    @GET
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/city/{city}")
    Response getWeatherByCity(@PathParam("city") String city);
}


