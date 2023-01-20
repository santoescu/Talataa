package co.com.talataa.usecase.moviemanagement;

import co.com.talataa.model.exception.BusinessException;
import co.com.talataa.model.movie.Movie;
import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;
import co.com.talataa.model.responsepopularmovie.gateways.ResponsePopularMovieService;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
public class MovieManagementUseCase {
    private final ResponsePopularMovieService responsePopularMovieService;
    public ResponsePopularMovie getPopularMovies(Long page) throws IOException {

        return responsePopularMovieService.getPopularMovies(page);
    }

    public Movie getMovie(Long id) throws IOException, BusinessException {
        Movie movie = responsePopularMovieService.getMovie(id);
        if(movie ==null){
            throw new BusinessException(400,"Pelicula "+id+" No existe");
        }
        return movie;
    }
    public String deleteMovie(Long id) throws IOException, BusinessException {
        Movie movie = responsePopularMovieService.getMovie(id);
        List<Movie> movies = responsePopularMovieService.getMovies();
        if (movie!= null){
            movies.remove(movie);
            movie.setStatusMovie(false);
            movies.add(movie);
            return "Se ha eliminado exitosamente";
        }
        throw new BusinessException(404,"Pelicula "+id+" no encontrada");
    }
    public Movie newMovie(Movie movie) throws IOException, BusinessException {
        Movie oldMovie = responsePopularMovieService.getMovie(movie.getId());
        List<Movie> movies = responsePopularMovieService.getMovies();
        if (oldMovie != null){
            throw new BusinessException(400,"Pelicula "+movie.getId()+" ya existe");
        }
        movie.setStatusMovie(true);
        movies.add(movie);
        return movie;
    }
    public Movie upDateMovie(Movie movie) throws IOException, BusinessException {
        Movie oldMovie = responsePopularMovieService.getMovie(movie.getId());
        List<Movie> movies = responsePopularMovieService.getMovies();
        if (oldMovie != null){
            Movie newMovie = validateFields(oldMovie,movie);
            movies.remove(oldMovie);
            movies.add(newMovie);
            return newMovie;
        }
        throw new BusinessException(404,"Pelicula "+movie.getId()+" no existe");
    }
    private Movie validateFields(Movie movie,Movie request){
        if (request.getAdult() != null){
            movie.setAdult(request.getAdult());
        }
        if (request.getGenres() != null){
            movie.setGenres(request.getGenres());
        }
        if (request.getHomepage() != null){
            movie.setHomepage(request.getHomepage());
        }
        if (request.getOverview() != null){
            movie.setOverview(request.getOverview());
        }
        if (request.getOverview() != null){
            movie.setOverview(request.getOverview());
        }
        if (request.getRevenue() != null){
            movie.setRevenue(request.getRevenue());
        }
        if (request.getRuntime() != null){
            movie.setRuntime(request.getRuntime());
        }
        if (request.getStatus() != null){
            movie.setStatus(request.getStatus());
        }
        if (request.getTagline() != null){
            movie.setTagline(request.getTagline());
        }
        if (request.getTitle() != null){
            movie.setTitle(request.getTitle());
        }
        if (request.getVideo() != null){
            movie.setVideo(request.getVideo());
        }
        if (request.getBackdropPath() != null){
            movie.setBackdropPath(request.getBackdropPath());
        }
        if (request.getBelongsToCollection() != null){
            movie.setBelongsToCollection(request.getBelongsToCollection());
        }
        if (request.getImdbID() != null){
            movie.setImdbID(request.getImdbID());
        }
        if (request.getOriginalLanguage() != null){
            movie.setOriginalLanguage(request.getOriginalLanguage());
        }
        if (request.getOriginalTitle() != null){
            movie.setOriginalTitle(request.getOriginalTitle());
        }
        if (request.getPosterPath() != null){
            movie.setPosterPath(request.getPosterPath());
        }
        if (request.getProductionCompanies() != null){
            movie.setProductionCompanies(request.getProductionCompanies());
        }
        if (request.getProductionCountries() != null){
            movie.setProductionCountries(request.getProductionCountries());
        }
        if (request.getReleaseDate() != null){
            movie.setReleaseDate(request.getReleaseDate());
        }
        if (request.getSpokenLanguages() != null){
            movie.setSpokenLanguages(request.getSpokenLanguages());
        }
        if (request.getVoteAverage() != null){
            movie.setVoteAverage(request.getVoteAverage());
        }
        if (request.getVoteCount() != null){
            movie.setVoteCount(request.getVoteCount());
        }
        if (request.getPopularity() != null){
            movie.setPopularity(request.getPopularity());
        }
        if (request.getBudget() != null){
            movie.setBudget(request.getBudget());
        }
        movie.setId(request.getId());
        movie.setStatusMovie(true);

        return movie;
    }
}
