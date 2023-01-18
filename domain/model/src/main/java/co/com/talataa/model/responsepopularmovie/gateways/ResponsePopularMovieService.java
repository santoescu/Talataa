package co.com.talataa.model.responsepopularmovie.gateways;

import co.com.talataa.model.movie.Movie;
import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;

import java.io.IOException;

public interface ResponsePopularMovieService {
    ResponsePopularMovie getPopularMovies() throws IOException;
    Movie getMovie(Long id) throws IOException;

}
