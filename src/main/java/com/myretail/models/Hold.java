
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
    "is_active"
})
public class Hold implements Serializable
{

    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6596649685327375233L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hold() {
    }

    /**
     * 
     * @param isActive
     */
    public Hold(Boolean isActive) {
        super();
        this.isActive = isActive;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
		return "Hold [isActive=" + isActive + ", additionalProperties=" + additionalProperties + "]";
	}

}
