package com.nixsolutions.provider;


import com.nixsolutions.client.Client;
import com.nixsolutions.entity.ProviderInterface;

import javax.ws.rs.core.Response;

public class Provider implements ProviderInterface {

    static final Client client = new Client();

    @Override
    public Response getWeatherByZip(String zip) {
        return Response.ok().entity(client.getWeather("zip=" + zip)).build();
    }

    @Override
    public Response getWeatherByCity(String city) {
        return Response.ok().entity(client.getWeather("q=" + city)).build();
    }
}

