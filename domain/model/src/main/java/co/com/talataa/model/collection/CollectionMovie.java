package co.com.talataa.model.collection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CollectionMovie {
    private Long id;
    private String name;
    @JsonProperty(value = "poster_path")
    private String posterPath;
    @JsonProperty(value = "backdrop_path")
    private String backdropPath;
}
