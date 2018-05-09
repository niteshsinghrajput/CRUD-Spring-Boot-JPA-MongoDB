
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
    "is_product_recalled"
})
public class RecallCompliance implements Serializable
{

    @JsonProperty("is_product_recalled")
    private Boolean isProductRecalled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6552533755057970728L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecallCompliance() {
    }

    /**
     * 
     * @param isProductRecalled
     */
    public RecallCompliance(Boolean isProductRecalled) {
        super();
        this.isProductRecalled = isProductRecalled;
    }

    @JsonProperty("is_product_recalled")
    public Boolean getIsProductRecalled() {
        return isProductRecalled;
    }

    @JsonProperty("is_product_recalled")
    public void setIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
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
		return "RecallCompliance [isProductRecalled=" + isProductRecalled + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
