
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
    "hold",
    "ship_to_guest"
})
public class EligibilityRules implements Serializable
{

    @JsonProperty("hold")
    private Hold hold;
    @JsonProperty("ship_to_guest")
    private ShipToGuest shipToGuest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6576199381121349489L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EligibilityRules() {
    }

    /**
     * 
     * @param shipToGuest
     * @param hold
     */
    public EligibilityRules(Hold hold, ShipToGuest shipToGuest) {
        super();
        this.hold = hold;
        this.shipToGuest = shipToGuest;
    }

    @JsonProperty("hold")
    public Hold getHold() {
        return hold;
    }

    @JsonProperty("hold")
    public void setHold(Hold hold) {
        this.hold = hold;
    }

    @JsonProperty("ship_to_guest")
    public ShipToGuest getShipToGuest() {
        return shipToGuest;
    }

    @JsonProperty("ship_to_guest")
    public void setShipToGuest(ShipToGuest shipToGuest) {
        this.shipToGuest = shipToGuest;
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
		return "EligibilityRules [hold=" + hold + ", shipToGuest=" + shipToGuest + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
