package co.com.talataa.model.responsepopularmovie;
import co.com.talataa.model.movie.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResponsePopularMovie {
    private Long page;
    private List<Movie> results;
    @JsonProperty(value = "total_pages")
    private Long totalPages;
    @JsonProperty(value = "total_results")
    private Long totalResults;
}
