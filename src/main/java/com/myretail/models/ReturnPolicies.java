
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
    "user",
    "policyDays",
    "guestMessage"
})
public class ReturnPolicies implements Serializable
{

    @JsonProperty("user")
    private String user;
    @JsonProperty("policyDays")
    private String policyDays;
    @JsonProperty("guestMessage")
    private String guestMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5760712035728463951L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReturnPolicies() {
    }

    /**
     * 
     * @param policyDays
     * @param guestMessage
     * @param user
     */
    public ReturnPolicies(String user, String policyDays, String guestMessage) {
        super();
        this.user = user;
        this.policyDays = policyDays;
        this.guestMessage = guestMessage;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("policyDays")
    public String getPolicyDays() {
        return policyDays;
    }

    @JsonProperty("policyDays")
    public void setPolicyDays(String policyDays) {
        this.policyDays = policyDays;
    }

    @JsonProperty("guestMessage")
    public String getGuestMessage() {
        return guestMessage;
    }

    @JsonProperty("guestMessage")
    public void setGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
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
		return "ReturnPolicies [user=" + user + ", policyDays=" + policyDays + ", guestMessage=" + guestMessage
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
