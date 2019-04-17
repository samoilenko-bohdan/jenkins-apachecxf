package com.nixsolutions.entity;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

public interface ProviderInterface {
    Response getWeatherByZip(String zip);

    Response getWeatherByCity(String city);
}
