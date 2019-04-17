package client;

import com.nixsolutions.client.Client;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void getWeather() throws IOException {
        WebClient client = WebClient.create("http://api.openweathermap.org/data/2.5/weather?" +
                "APPID=8c284eaf2053d6cc7c76b5052fdc0362&units=metric&zip=94040");
        Response response = client.accept("application/json").get();
        Client client1 = new Client();
        String expectedWeather = IOUtils.toString((InputStream)response.getEntity());
        client1.getWeather("zip=94040");
        String actualWeather = client1.getFullWeather();
        assertEquals(expectedWeather, actualWeather);
    }
}