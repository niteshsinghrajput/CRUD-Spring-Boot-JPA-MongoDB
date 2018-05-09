
package com.myretail.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total_count",
    "labels"
})
public class DeepRedLabels implements Serializable
{

    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2144377122230053470L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeepRedLabels() {
    }

    /**
     * 
     * @param totalCount
     * @param labels
     */
    public DeepRedLabels(Integer totalCount, List<Label> labels) {
        super();
        this.totalCount = totalCount;
        this.labels = labels;
    }

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
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
		return "DeepRedLabels [totalCount=" + totalCount + ", labels=" + labels + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
