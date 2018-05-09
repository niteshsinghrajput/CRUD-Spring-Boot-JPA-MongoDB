
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
    "product_id",
    "id_type",
    "available_to_promise_quantity",
    "street_date",
    "availability",
    "online_available_to_promise_quantity",
    "stores_available_to_promise_quantity",
    "availability_status",
    "multichannel_options",
    "is_infinite_inventory",
    "loyalty_availability_status",
    "loyalty_purchase_start_date_time",
    "is_loyalty_purchase_enabled"
})
public class AvailableToPromiseNetwork implements Serializable
{

    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("id_type")
    private String idType;
    @JsonProperty("available_to_promise_quantity")
    private Double availableToPromiseQuantity;
    @JsonProperty("street_date")
    private String streetDate;
    @JsonProperty("availability")
    private String availability;
    @JsonProperty("online_available_to_promise_quantity")
    private Double onlineAvailableToPromiseQuantity;
    @JsonProperty("stores_available_to_promise_quantity")
    private Double storesAvailableToPromiseQuantity;
    @JsonProperty("availability_status")
    private String availabilityStatus;
    @JsonProperty("multichannel_options")
    private List<String> multichannelOptions = null;
    @JsonProperty("is_infinite_inventory")
    private Boolean isInfiniteInventory;
    @JsonProperty("loyalty_availability_status")
    private String loyaltyAvailabilityStatus;
    @JsonProperty("loyalty_purchase_start_date_time")
    private String loyaltyPurchaseStartDateTime;
    @JsonProperty("is_loyalty_purchase_enabled")
    private Boolean isLoyaltyPurchaseEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7390206435492718740L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AvailableToPromiseNetwork() {
    }

    /**
     * 
     * @param isLoyaltyPurchaseEnabled
     * @param idType
     * @param availableToPromiseQuantity
     * @param streetDate
     * @param availabilityStatus
     * @param loyaltyPurchaseStartDateTime
     * @param multichannelOptions
     * @param productId
     * @param onlineAvailableToPromiseQuantity
     * @param storesAvailableToPromiseQuantity
     * @param loyaltyAvailabilityStatus
     * @param isInfiniteInventory
     * @param availability
     */
    public AvailableToPromiseNetwork(String productId, String idType, Double availableToPromiseQuantity, String streetDate, String availability, Double onlineAvailableToPromiseQuantity, Double storesAvailableToPromiseQuantity, String availabilityStatus, List<String> multichannelOptions, Boolean isInfiniteInventory, String loyaltyAvailabilityStatus, String loyaltyPurchaseStartDateTime, Boolean isLoyaltyPurchaseEnabled) {
        super();
        this.productId = productId;
        this.idType = idType;
        this.availableToPromiseQuantity = availableToPromiseQuantity;
        this.streetDate = streetDate;
        this.availability = availability;
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
        this.availabilityStatus = availabilityStatus;
        this.multichannelOptions = multichannelOptions;
        this.isInfiniteInventory = isInfiniteInventory;
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
        this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
    }

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("id_type")
    public String getIdType() {
        return idType;
    }

    @JsonProperty("id_type")
    public void setIdType(String idType) {
        this.idType = idType;
    }

    @JsonProperty("available_to_promise_quantity")
    public Double getAvailableToPromiseQuantity() {
        return availableToPromiseQuantity;
    }

    @JsonProperty("available_to_promise_quantity")
    public void setAvailableToPromiseQuantity(Double availableToPromiseQuantity) {
        this.availableToPromiseQuantity = availableToPromiseQuantity;
    }

    @JsonProperty("street_date")
    public String getStreetDate() {
        return streetDate;
    }

    @JsonProperty("street_date")
    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @JsonProperty("online_available_to_promise_quantity")
    public Double getOnlineAvailableToPromiseQuantity() {
        return onlineAvailableToPromiseQuantity;
    }

    @JsonProperty("online_available_to_promise_quantity")
    public void setOnlineAvailableToPromiseQuantity(Double onlineAvailableToPromiseQuantity) {
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
    }

    @JsonProperty("stores_available_to_promise_quantity")
    public Double getStoresAvailableToPromiseQuantity() {
        return storesAvailableToPromiseQuantity;
    }

    @JsonProperty("stores_available_to_promise_quantity")
    public void setStoresAvailableToPromiseQuantity(Double storesAvailableToPromiseQuantity) {
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
    }

    @JsonProperty("availability_status")
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    @JsonProperty("availability_status")
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @JsonProperty("multichannel_options")
    public List<String> getMultichannelOptions() {
        return multichannelOptions;
    }

    @JsonProperty("multichannel_options")
    public void setMultichannelOptions(List<String> multichannelOptions) {
        this.multichannelOptions = multichannelOptions;
    }

    @JsonProperty("is_infinite_inventory")
    public Boolean getIsInfiniteInventory() {
        return isInfiniteInventory;
    }

    @JsonProperty("is_infinite_inventory")
    public void setIsInfiniteInventory(Boolean isInfiniteInventory) {
        this.isInfiniteInventory = isInfiniteInventory;
    }

    @JsonProperty("loyalty_availability_status")
    public String getLoyaltyAvailabilityStatus() {
        return loyaltyAvailabilityStatus;
    }

    @JsonProperty("loyalty_availability_status")
    public void setLoyaltyAvailabilityStatus(String loyaltyAvailabilityStatus) {
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
    }

    @JsonProperty("loyalty_purchase_start_date_time")
    public String getLoyaltyPurchaseStartDateTime() {
        return loyaltyPurchaseStartDateTime;
    }

    @JsonProperty("loyalty_purchase_start_date_time")
    public void setLoyaltyPurchaseStartDateTime(String loyaltyPurchaseStartDateTime) {
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
    }

    @JsonProperty("is_loyalty_purchase_enabled")
    public Boolean getIsLoyaltyPurchaseEnabled() {
        return isLoyaltyPurchaseEnabled;
    }

    @JsonProperty("is_loyalty_purchase_enabled")
    public void setIsLoyaltyPurchaseEnabled(Boolean isLoyaltyPurchaseEnabled) {
        this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
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
		return "AvailableToPromiseNetwork [productId=" + productId + ", idType=" + idType
				+ ", availableToPromiseQuantity=" + availableToPromiseQuantity + ", streetDate=" + streetDate
				+ ", availability=" + availability + ", onlineAvailableToPromiseQuantity="
				+ onlineAvailableToPromiseQuantity + ", storesAvailableToPromiseQuantity="
				+ storesAvailableToPromiseQuantity + ", availabilityStatus=" + availabilityStatus
				+ ", multichannelOptions=" + multichannelOptions + ", isInfiniteInventory=" + isInfiniteInventory
				+ ", loyaltyAvailabilityStatus=" + loyaltyAvailabilityStatus + ", loyaltyPurchaseStartDateTime="
				+ loyaltyPurchaseStartDateTime + ", isLoyaltyPurchaseEnabled=" + isLoyaltyPurchaseEnabled
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
