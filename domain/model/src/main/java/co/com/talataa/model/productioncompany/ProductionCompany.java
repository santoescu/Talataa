package co.com.talataa.model.productioncompany;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class ProductionCompany {
    private Long id;
    @JsonProperty(value = "logo_path")
    private String logoPath;
    private String name;
    @JsonProperty(value = "origin_country")
    private String originalCountry;
}
