package Models;

import com.fasterxml.jackson.annotation.*;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "key1",
        "key2"
})
@Generated("jsonschema2pojo")
@Nullable
public class TeamNames {

    @JsonProperty("key1")
    private String key1;
    @JsonProperty("key2")
    private String key2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("key1")
    public String getKey1() {
        return key1;
    }

    @JsonProperty("key1")
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    @JsonProperty("key2")
    public String getKey2() {
        return key2;
    }

    @JsonProperty("key2")
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
