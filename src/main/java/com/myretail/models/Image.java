
package com.myretail.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_url",
    "primary"
})
public class Image implements Serializable
{

    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("primary")
    private String primary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -175691937828699693L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param baseUrl
     * @param primary
     */
    public Image(String baseUrl, String primary) {
        super();
        this.baseUrl = baseUrl;
        this.primary = primary;
    }

    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("primary")
    public String getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
	public String toString() {
		return "Image [baseUrl=" + baseUrl + ", primary=" + primary + ", additionalProperties=" + additionalProperties
				+ "]";
	}

}
