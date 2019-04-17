package com.nixsolutions.client;

import com.nixsolutions.entity.Weather;

public interface ClientInterface {
     Weather getWeather(String param);
}
