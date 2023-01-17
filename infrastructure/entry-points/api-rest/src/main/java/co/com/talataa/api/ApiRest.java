package co.com.talataa.api;
import co.com.talataa.model.responsepopularmovie.ResponsePopularMovie;
import co.com.talataa.usecase.moviemanagement.MovieManagementUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


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
    public ResponsePopularMovie getPopularMovies() {
        try {
            return movieManagementUseCase.getPopularMovies();
        }catch (IOException e){
            return null;
        }

    }
}
