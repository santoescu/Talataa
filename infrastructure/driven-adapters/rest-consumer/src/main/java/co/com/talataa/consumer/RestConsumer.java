package co.com.talataa.consumer;

import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;
import co.com.talataa.model.responsepopularmovie.gateways.ResponsePopularMovieService;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class RestConsumer implements ResponsePopularMovieService// implements Gateway from domain
{

    @Value("${adapter.restconsumer.url}")
    private String url;
    private final String apiKey = "2e2e5b11db7074b90737af4b95869929";
    private final OkHttpClient client;
    private final ObjectMapper mapper;

    public ResponsePopularMovie getPopularMovies() throws IOException {

        Request request = new Request.Builder()
                .url(url+"/movie/popular?api_key="+apiKey)
                .get()
                .addHeader("Content-Type","application/json")
                .build();

        return mapper.readValue(client.newCall(request).execute().body().string(), ResponsePopularMovie.class);
    }

    public ObjectResponse testPost() throws IOException {
        String json = mapper.writeValueAsString(ObjectRequest.builder()
            .val1("exampleval1")
            .val2("exampleval1")
            .build()
        );

        RequestBody requestBody = RequestBody
            .create(json, MediaType.parse("application/json; charset=utf-8"));

        Request request = new Request.Builder()
            .url(url)
            .post(requestBody)
            .addHeader("Content-Type","application/json")
            .build();

        return mapper.readValue(client.newCall(request).execute().body().string(), ObjectResponse.class);

    }

}
