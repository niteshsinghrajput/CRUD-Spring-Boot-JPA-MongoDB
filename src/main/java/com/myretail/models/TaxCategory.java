
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
    "tax_class",
    "tax_code_id",
    "tax_code"
})
public class TaxCategory implements Serializable
{

    @JsonProperty("tax_class")
    private String taxClass;
    @JsonProperty("tax_code_id")
    private Integer taxCodeId;
    @JsonProperty("tax_code")
    private String taxCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1618900864529229935L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxCategory() {
    }

    /**
     * 
     * @param taxClass
     * @param taxCodeId
     * @param taxCode
     */
    public TaxCategory(String taxClass, Integer taxCodeId, String taxCode) {
        super();
        this.taxClass = taxClass;
        this.taxCodeId = taxCodeId;
        this.taxCode = taxCode;
    }

    @JsonProperty("tax_class")
    public String getTaxClass() {
        return taxClass;
    }

    @JsonProperty("tax_class")
    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    @JsonProperty("tax_code_id")
    public Integer getTaxCodeId() {
        return taxCodeId;
    }

    @JsonProperty("tax_code_id")
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    @JsonProperty("tax_code")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
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
		return "TaxCategory [taxClass=" + taxClass + ", taxCodeId=" + taxCodeId + ", taxCode=" + taxCode
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
