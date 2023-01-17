package co.com.talataa.usecase.moviemanagement;

import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;
import co.com.talataa.model.responsepopularmovie.gateways.ResponsePopularMovieService;
import lombok.RequiredArgsConstructor;

import java.io.IOException;


@RequiredArgsConstructor
public class MovieManagementUseCase {
    private final ResponsePopularMovieService responsePopularMovieService;
    public ResponsePopularMovie getPopularMovies() throws IOException {

        return responsePopularMovieService.getPopularMovies();
    }
}
