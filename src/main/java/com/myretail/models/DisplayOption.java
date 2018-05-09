
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
    "is_size_chart",
    "is_warranty"
})
public class DisplayOption implements Serializable
{

    @JsonProperty("is_size_chart")
    private Boolean isSizeChart;
    @JsonProperty("is_warranty")
    private Boolean isWarranty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1827243247229967184L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DisplayOption() {
    }

    /**
     * 
     * @param isSizeChart
     * @param isWarranty
     */
    public DisplayOption(Boolean isSizeChart, Boolean isWarranty) {
        super();
        this.isSizeChart = isSizeChart;
        this.isWarranty = isWarranty;
    }

    @JsonProperty("is_size_chart")
    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    @JsonProperty("is_size_chart")
    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

    @JsonProperty("is_warranty")
    public Boolean getIsWarranty() {
        return isWarranty;
    }

    @JsonProperty("is_warranty")
    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
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
		return "DisplayOption [isSizeChart=" + isSizeChart + ", isWarranty=" + isWarranty + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
