package co.com.talataa.model.responsepopularmovie.gateways;

import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;

import java.io.IOException;

public interface ResponsePopularMovieService {
    ResponsePopularMovie getPopularMovies() throws IOException;
}
