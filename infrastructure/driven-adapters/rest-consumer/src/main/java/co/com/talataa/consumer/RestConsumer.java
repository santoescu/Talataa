package co.com.talataa.consumer;

import co.com.talataa.model.movie.Movie;
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
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestConsumer implements ResponsePopularMovieService// implements Gateway from domain
{

    @Value("${adapter.restconsumer.url}")
    private String url;
    private final String apiKey = "2e2e5b11db7074b90737af4b95869929";
    private final OkHttpClient client;
    private final ObjectMapper mapper;
    private final ListMovie listMovie;

    public ResponsePopularMovie getPopularMovies(Long page) throws IOException {
        String finalUrl=url+"/movie/popular?api_key="+apiKey;
        if(page != null){
            finalUrl+="&page="+page;
        }

        Request request = new Request.Builder()
                .url(finalUrl)
                .get()
                .addHeader("Content-Type","application/json")
                .build();

        return mapper.readValue(client.newCall(request).execute().body().string(), ResponsePopularMovie.class);
    }

    public Movie getMovie(Long id) throws IOException {
        Optional<Movie> optionalMovie = listMovie.getListMovie().stream().filter(m -> m.getId().equals(id) && m.isStatusMovie()).findFirst();
        if(optionalMovie.isPresent()){

            return optionalMovie.get();
        }
        if(listMovie.getListMovie().stream().anyMatch(m -> m.getId().equals(id))){
            return null;
        }
        Request request = new Request.Builder()
                .url(url+"/movie/"+id+"?api_key="+apiKey)
                .get()
                .addHeader("Content-Type","application/json")
                .build();

       Movie movie = mapper.readValue(client.newCall(request).execute().body().string(), Movie.class);
       movie.setStatusMovie(true);
       listMovie.getListMovie().add(movie);
       return movie;
    }

    public List<Movie> getMovies(){
        return listMovie.getListMovie();
    }




}
