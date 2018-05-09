
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
    "title",
    "bullet_description",
    "general_description"
})
public class ProductDescription implements Serializable
{

    @JsonProperty("title")
    private String title;
    @JsonProperty("bullet_description")
    private List<String> bulletDescription = null;
    @JsonProperty("general_description")
    private String generalDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 732834054313477238L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductDescription() {
    }

    /**
     * 
     * @param generalDescription
     * @param title
     * @param bulletDescription
     */
    public ProductDescription(String title, List<String> bulletDescription, String generalDescription) {
        super();
        this.title = title;
        this.bulletDescription = bulletDescription;
        this.generalDescription = generalDescription;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("bullet_description")
    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    @JsonProperty("bullet_description")
    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    @JsonProperty("general_description")
    public String getGeneralDescription() {
        return generalDescription;
    }

    @JsonProperty("general_description")
    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
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
		return "ProductDescription [title=" + title + ", bulletDescription=" + bulletDescription
				+ ", generalDescription=" + generalDescription + ", additionalProperties=" + additionalProperties + "]";
	}

}
