
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
    "images",
    "sales_classification_nodes"
})
public class Enrichment implements Serializable
{

    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("sales_classification_nodes")
    private List<SalesClassificationNode> salesClassificationNodes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8007229230662051148L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Enrichment() {
    }

    /**
     * 
     * @param salesClassificationNodes
     * @param images
     */
    public Enrichment(List<Image> images, List<SalesClassificationNode> salesClassificationNodes) {
        super();
        this.images = images;
        this.salesClassificationNodes = salesClassificationNodes;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("sales_classification_nodes")
    public List<SalesClassificationNode> getSalesClassificationNodes() {
        return salesClassificationNodes;
    }

    @JsonProperty("sales_classification_nodes")
    public void setSalesClassificationNodes(List<SalesClassificationNode> salesClassificationNodes) {
        this.salesClassificationNodes = salesClassificationNodes;
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
		return "Enrichment [images=" + images + ", salesClassificationNodes=" + salesClassificationNodes
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
