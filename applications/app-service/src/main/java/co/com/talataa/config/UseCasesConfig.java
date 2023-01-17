package co.com.talataa.config;

import co.com.talataa.model.responsepopularmovie.gateways.ResponsePopularMovieService;
import co.com.talataa.usecase.moviemanagement.MovieManagementUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {
        @Bean
        public MovieManagementUseCase movieManagementUseCase(ResponsePopularMovieService responsePopularMovieService){
                return new MovieManagementUseCase(responsePopularMovieService);
        }
}
