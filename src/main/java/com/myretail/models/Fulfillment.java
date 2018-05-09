
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
    "is_po_box_prohibited",
    "po_box_prohibited_message"
})
public class Fulfillment implements Serializable
{

    @JsonProperty("is_po_box_prohibited")
    private Boolean isPoBoxProhibited;
    @JsonProperty("po_box_prohibited_message")
    private String poBoxProhibitedMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3630194454665832625L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param isPoBoxProhibited
     * @param poBoxProhibitedMessage
     */
    public Fulfillment(Boolean isPoBoxProhibited, String poBoxProhibitedMessage) {
        super();
        this.isPoBoxProhibited = isPoBoxProhibited;
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }

    @JsonProperty("is_po_box_prohibited")
    public Boolean getIsPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    @JsonProperty("is_po_box_prohibited")
    public void setIsPoBoxProhibited(Boolean isPoBoxProhibited) {
        this.isPoBoxProhibited = isPoBoxProhibited;
    }

    @JsonProperty("po_box_prohibited_message")
    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    @JsonProperty("po_box_prohibited_message")
    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
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
		return "Fulfillment [isPoBoxProhibited=" + isPoBoxProhibited + ", poBoxProhibitedMessage="
				+ poBoxProhibitedMessage + ", additionalProperties=" + additionalProperties + "]";
	}

}
