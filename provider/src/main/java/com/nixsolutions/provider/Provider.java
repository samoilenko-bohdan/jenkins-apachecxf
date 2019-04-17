package com.nixsolutions.provider;


import com.nixsolutions.client.Client;
import com.nixsolutions.entity.ProviderInterface;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/weather")
public class Provider implements ProviderInterface {

    final static Client client = new Client();

    @GET
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/zip/{zip}")
    public Response getWeatherByZip(@PathParam("zip") String zip) {
        return Response.ok().entity(client.getWeather("zip=" + zip)).build();
    }

    @GET
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/city/{city}")
    public Response getWeatherByCity(@PathParam("city") String city) {
        return Response.ok().entity(client.getWeather("q=" + city)).build();
    }
}

