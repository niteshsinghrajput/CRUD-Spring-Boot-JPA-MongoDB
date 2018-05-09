
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
    "gift_wrapable",
    "has_prop65",
    "is_hazmat",
    "max_order_qty",
    "street_date",
    "media_format",
    "merch_class",
    "merch_subclass",
    "return_method"
})
public class Attributes implements Serializable
{

    @JsonProperty("gift_wrapable")
    private String giftWrapable;
    @JsonProperty("has_prop65")
    private String hasProp65;
    @JsonProperty("is_hazmat")
    private String isHazmat;
    @JsonProperty("max_order_qty")
    private Integer maxOrderQty;
    @JsonProperty("street_date")
    private String streetDate;
    @JsonProperty("media_format")
    private String mediaFormat;
    @JsonProperty("merch_class")
    private String merchClass;
    @JsonProperty("merch_subclass")
    private Integer merchSubclass;
    @JsonProperty("return_method")
    private String returnMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2817892339799099919L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param hasProp65
     * @param streetDate
     * @param giftWrapable
     * @param isHazmat
     * @param returnMethod
     * @param merchSubclass
     * @param merchClass
     * @param maxOrderQty
     * @param mediaFormat
     */
    public Attributes(String giftWrapable, String hasProp65, String isHazmat, Integer maxOrderQty, String streetDate, String mediaFormat, String merchClass, Integer merchSubclass, String returnMethod) {
        super();
        this.giftWrapable = giftWrapable;
        this.hasProp65 = hasProp65;
        this.isHazmat = isHazmat;
        this.maxOrderQty = maxOrderQty;
        this.streetDate = streetDate;
        this.mediaFormat = mediaFormat;
        this.merchClass = merchClass;
        this.merchSubclass = merchSubclass;
        this.returnMethod = returnMethod;
    }

    @JsonProperty("gift_wrapable")
    public String getGiftWrapable() {
        return giftWrapable;
    }

    @JsonProperty("gift_wrapable")
    public void setGiftWrapable(String giftWrapable) {
        this.giftWrapable = giftWrapable;
    }

    @JsonProperty("has_prop65")
    public String getHasProp65() {
        return hasProp65;
    }

    @JsonProperty("has_prop65")
    public void setHasProp65(String hasProp65) {
        this.hasProp65 = hasProp65;
    }

    @JsonProperty("is_hazmat")
    public String getIsHazmat() {
        return isHazmat;
    }

    @JsonProperty("is_hazmat")
    public void setIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
    }

    @JsonProperty("max_order_qty")
    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    @JsonProperty("max_order_qty")
    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    @JsonProperty("street_date")
    public String getStreetDate() {
        return streetDate;
    }

    @JsonProperty("street_date")
    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    @JsonProperty("media_format")
    public String getMediaFormat() {
        return mediaFormat;
    }

    @JsonProperty("media_format")
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    @JsonProperty("merch_class")
    public String getMerchClass() {
        return merchClass;
    }

    @JsonProperty("merch_class")
    public void setMerchClass(String merchClass) {
        this.merchClass = merchClass;
    }

    @JsonProperty("merch_subclass")
    public Integer getMerchSubclass() {
        return merchSubclass;
    }

    @JsonProperty("merch_subclass")
    public void setMerchSubclass(Integer merchSubclass) {
        this.merchSubclass = merchSubclass;
    }

    @JsonProperty("return_method")
    public String getReturnMethod() {
        return returnMethod;
    }

    @JsonProperty("return_method")
    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
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
		return "Attributes [giftWrapable=" + giftWrapable + ", hasProp65=" + hasProp65 + ", isHazmat=" + isHazmat
				+ ", maxOrderQty=" + maxOrderQty + ", streetDate=" + streetDate + ", mediaFormat=" + mediaFormat
				+ ", merchClass=" + merchClass + ", merchSubclass=" + merchSubclass + ", returnMethod=" + returnMethod
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    
}
