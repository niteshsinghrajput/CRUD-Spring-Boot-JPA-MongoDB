
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
    "category_type",
    "type",
    "name"
})
public class ItemType implements Serializable
{

    @JsonProperty("category_type")
    private String categoryType;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6240986881378714898L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemType() {
    }

    /**
     * 
     * @param name
     * @param categoryType
     * @param type
     */
    public ItemType(String categoryType, Integer type, String name) {
        super();
        this.categoryType = categoryType;
        this.type = type;
        this.name = name;
    }

    @JsonProperty("category_type")
    public String getCategoryType() {
        return categoryType;
    }

    @JsonProperty("category_type")
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
		return "ItemType [categoryType=" + categoryType + ", type=" + type + ", name=" + name
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
