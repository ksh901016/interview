package HTTP;


import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class HttpTest {
    @Test
    public void makeBareHttpRequest() throws IOException {
        final URL url = new URL("http", "en.wikipedia.org","/wiki/Main_Page");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        final InputStream responseInputStream = connection.getInputStream();

        final int responseCode = connection.getResponseCode();
        final String response = IOUtils.toString(responseInputStream); // commons-io

        responseInputStream.close();

        assertEquals(200, responseCode);
        System.out.printf("Response Received : [%s]%n", response);
    }
}
