package co.com.talataa.model.spokenlanguage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SpokenLanguage {
    @JsonProperty(value = "english_name")
    private String englishName;
    @JsonProperty(value = "iso_639_1")
    private String iso6391;
    private String name;
}
