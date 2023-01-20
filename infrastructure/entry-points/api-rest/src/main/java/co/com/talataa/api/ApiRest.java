package co.com.talataa.api;
import co.com.talataa.model.exception.BusinessException;
import co.com.talataa.model.movie.Movie;
import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;
import co.com.talataa.usecase.moviemanagement.MovieManagementUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final MovieManagementUseCase movieManagementUseCase;


    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }
    @GetMapping(path = "/movie/popular")
    public ResponsePopularMovie getPopularMovies(@RequestParam(required = false) Long page) {
        try {
            return movieManagementUseCase.getPopularMovies(page);
        }catch (IOException e){
            return null;
        }

    }
    @GetMapping(path = "/movie/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(movieManagementUseCase.getMovie(id));
        }catch (IOException e){
            return null;
        }catch (BusinessException e){
            return ResponseEntity.status(e.getStatusCode()).body(e.getDescription());
        }

    }
    @DeleteMapping(path = "/movie/delete/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id) {
        try {
            String response = movieManagementUseCase.deleteMovie(id);

                return ResponseEntity.status(HttpStatus.OK).body(response);

        }catch (BusinessException e){
            return ResponseEntity.status(e.getStatusCode()).body(e.getDescription());
        }catch (IOException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }
    @PostMapping(path = "/movie/new")
    public ResponseEntity<?> newMovie(@RequestBody Movie movie) {
        try {
            Movie response = movieManagementUseCase.newMovie(movie);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch (BusinessException e){
            return ResponseEntity.status(e.getStatusCode()).body(e.getDescription());
        }catch (IOException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }
    @PutMapping(path = "/movie/update")
    public ResponseEntity<?> upDateMovie(@RequestBody Movie movie) {
        try {
            Movie response= movieManagementUseCase.upDateMovie(movie);

            return ResponseEntity.status(HttpStatus.OK).body(response);
        }catch (BusinessException e){
            return ResponseEntity.status(e.getStatusCode()).body(e.getDescription());
        }catch (IOException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
