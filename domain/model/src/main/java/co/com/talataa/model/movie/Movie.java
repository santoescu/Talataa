package co.com.talataa.model.movie;
import co.com.talataa.model.collection.CollectionMovie;
import co.com.talataa.model.genre.Genre;
import co.com.talataa.model.productioncompany.ProductionCompany;
import co.com.talataa.model.productioncountry.ProductionCountry;
import co.com.talataa.model.spokenlanguage.SpokenLanguage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Movie {
    private boolean adult;
    @JsonProperty(value = "backdrop_path")
    private String backdropPath;
    @JsonProperty(value = "belongs_to_collection")
    private CollectionMovie belongsToCollection;
    private Long budget;
    private List<Genre> genres;
    private String homepage;
    private Long id;
    @JsonProperty(value = "imdb_id")
    private String imdbID;
    @JsonProperty(value = "original_language")
    private String originalLanguage;
    @JsonProperty(value = "original_title")
    private String originalTitle;
    private String overview;
    private float popularity;
    @JsonProperty(value = "poster_path")
    private String posterPath;
    @JsonProperty(value = "production_companies")
    private List<ProductionCompany> productionCompanies;
    @JsonProperty(value = "production_countries")
    private List<ProductionCountry> productionCountries;
    @JsonProperty(value = "release_date")
    private String releaseDate;
    private Long revenue;
    private Long runtime;
    @JsonProperty(value = "spoken_languages")
    private List<SpokenLanguage> spokenLanguages;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    @JsonProperty(value = "vote_average")
    private float voteAverage;
    @JsonProperty(value = "vote_count")
    private Long voteCount;
    @JsonProperty(value = "genre_ids")
    private List<Integer> genreIds;
}
