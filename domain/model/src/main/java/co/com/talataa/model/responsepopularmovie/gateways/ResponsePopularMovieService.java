package co.com.talataa.model.responsepopularmovie.gateways;

import co.com.talataa.model.movie.Movie;
import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ResponsePopularMovieService {
    ResponsePopularMovie getPopularMovies(Long page) throws IOException;
    Movie getMovie(Long id) throws IOException;

    List<Movie> getMovies();

}
