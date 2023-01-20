package co.com.talataa.consumer;

import co.com.talataa.model.movie.Movie;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListMovie {
    private List<Movie> listMovie;

    public ListMovie() {
        this.listMovie = new ArrayList<>();
    }
}
