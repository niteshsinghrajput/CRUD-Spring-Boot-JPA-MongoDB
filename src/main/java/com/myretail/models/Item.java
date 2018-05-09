
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
    "tcin",
    "bundle_components",
    "dpci",
    "upc",
    "product_description",
    "parent_items",
    "buy_url",
    "variation",
    "enrichment",
    "return_method",
    "handling",
    "recall_compliance",
    "tax_category",
    "display_option",
    "fulfillment",
    "package_dimensions",
    "environmental_segmentation",
    "manufacturer",
    "product_vendors",
    "product_classification",
    "product_brand",
    "item_state",
    "specifications",
    "attributes",
    "country_of_origin",
    "relationship_type_code",
    "subscription_eligible",
    "ribbons",
    "tags",
    "estore_item_status_code",
    "eligibility_rules",
    "return_policies",
    "gifting_enabled"
})
public class Item implements Serializable
{

    @JsonProperty("tcin")
    private String tcin;
    @JsonProperty("bundle_components")
    private BundleComponents bundleComponents;
    @JsonProperty("dpci")
    private String dpci;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("product_description")
    private ProductDescription productDescription;
    @JsonProperty("parent_items")
    private String parentItems;
    @JsonProperty("buy_url")
    private String buyUrl;
    @JsonProperty("variation")
    private Variation variation;
    @JsonProperty("enrichment")
    private Enrichment enrichment;
    @JsonProperty("return_method")
    private String returnMethod;
    @JsonProperty("handling")
    private Handling handling;
    @JsonProperty("recall_compliance")
    private RecallCompliance recallCompliance;
    @JsonProperty("tax_category")
    private TaxCategory taxCategory;
    @JsonProperty("display_option")
    private DisplayOption displayOption;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("package_dimensions")
    private PackageDimensions packageDimensions;
    @JsonProperty("environmental_segmentation")
    private EnvironmentalSegmentation environmentalSegmentation;
    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;
    @JsonProperty("product_vendors")
    private List<ProductVendor> productVendors = null;
    @JsonProperty("product_classification")
    private ProductClassification productClassification;
    @JsonProperty("product_brand")
    private ProductBrand productBrand;
    @JsonProperty("item_state")
    private String itemState;
    @JsonProperty("specifications")
    private List<Object> specifications = null;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    @JsonProperty("relationship_type_code")
    private String relationshipTypeCode;
    @JsonProperty("subscription_eligible")
    private Boolean subscriptionEligible;
    @JsonProperty("ribbons")
    private List<Object> ribbons = null;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("estore_item_status_code")
    private String estoreItemStatusCode;
    @JsonProperty("eligibility_rules")
    private EligibilityRules eligibilityRules;
    @JsonProperty("return_policies")
    private ReturnPolicies returnPolicies;
    @JsonProperty("gifting_enabled")
    private Boolean giftingEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5480918225049164839L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param estoreItemStatusCode
     * @param productDescription
     * @param enrichment
     * @param variation
     * @param itemState
     * @param recallCompliance
     * @param handling
     * @param tcin
     * @param displayOption
     * @param productBrand
     * @param environmentalSegmentation
     * @param eligibilityRules
     * @param parentItems
     * @param returnMethod
     * @param bundleComponents
     * @param giftingEnabled
     * @param countryOfOrigin
     * @param tags
     * @param ribbons
     * @param fulfillment
     * @param subscriptionEligible
     * @param buyUrl
     * @param upc
     * @param taxCategory
     * @param packageDimensions
     * @param specifications
     * @param relationshipTypeCode
     * @param returnPolicies
     * @param productClassification
     * @param manufacturer
     * @param productVendors
     * @param attributes
     * @param dpci
     */
    public Item(String tcin, BundleComponents bundleComponents, String dpci, String upc, ProductDescription productDescription, String parentItems, String buyUrl, Variation variation, Enrichment enrichment, String returnMethod, Handling handling, RecallCompliance recallCompliance, TaxCategory taxCategory, DisplayOption displayOption, Fulfillment fulfillment, PackageDimensions packageDimensions, EnvironmentalSegmentation environmentalSegmentation, Manufacturer manufacturer, List<ProductVendor> productVendors, ProductClassification productClassification, ProductBrand productBrand, String itemState, List<Object> specifications, Attributes attributes, String countryOfOrigin, String relationshipTypeCode, Boolean subscriptionEligible, List<Object> ribbons, List<Object> tags, String estoreItemStatusCode, EligibilityRules eligibilityRules, ReturnPolicies returnPolicies, Boolean giftingEnabled) {
        super();
        this.tcin = tcin;
        this.bundleComponents = bundleComponents;
        this.dpci = dpci;
        this.upc = upc;
        this.productDescription = productDescription;
        this.parentItems = parentItems;
        this.buyUrl = buyUrl;
        this.variation = variation;
        this.enrichment = enrichment;
        this.returnMethod = returnMethod;
        this.handling = handling;
        this.recallCompliance = recallCompliance;
        this.taxCategory = taxCategory;
        this.displayOption = displayOption;
        this.fulfillment = fulfillment;
        this.packageDimensions = packageDimensions;
        this.environmentalSegmentation = environmentalSegmentation;
        this.manufacturer = manufacturer;
        this.productVendors = productVendors;
        this.productClassification = productClassification;
        this.productBrand = productBrand;
        this.itemState = itemState;
        this.specifications = specifications;
        this.attributes = attributes;
        this.countryOfOrigin = countryOfOrigin;
        this.relationshipTypeCode = relationshipTypeCode;
        this.subscriptionEligible = subscriptionEligible;
        this.ribbons = ribbons;
        this.tags = tags;
        this.estoreItemStatusCode = estoreItemStatusCode;
        this.eligibilityRules = eligibilityRules;
        this.returnPolicies = returnPolicies;
        this.giftingEnabled = giftingEnabled;
    }

    @JsonProperty("tcin")
    public String getTcin() {
        return tcin;
    }

    @JsonProperty("tcin")
    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    @JsonProperty("bundle_components")
    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    @JsonProperty("bundle_components")
    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    @JsonProperty("dpci")
    public String getDpci() {
        return dpci;
    }

    @JsonProperty("dpci")
    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("product_description")
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    @JsonProperty("product_description")
    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("parent_items")
    public String getParentItems() {
        return parentItems;
    }

    @JsonProperty("parent_items")
    public void setParentItems(String parentItems) {
        this.parentItems = parentItems;
    }

    @JsonProperty("buy_url")
    public String getBuyUrl() {
        return buyUrl;
    }

    @JsonProperty("buy_url")
    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    @JsonProperty("variation")
    public Variation getVariation() {
        return variation;
    }

    @JsonProperty("variation")
    public void setVariation(Variation variation) {
        this.variation = variation;
    }

    @JsonProperty("enrichment")
    public Enrichment getEnrichment() {
        return enrichment;
    }

    @JsonProperty("enrichment")
    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    @JsonProperty("return_method")
    public String getReturnMethod() {
        return returnMethod;
    }

    @JsonProperty("return_method")
    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    @JsonProperty("handling")
    public Handling getHandling() {
        return handling;
    }

    @JsonProperty("handling")
    public void setHandling(Handling handling) {
        this.handling = handling;
    }

    @JsonProperty("recall_compliance")
    public RecallCompliance getRecallCompliance() {
        return recallCompliance;
    }

    @JsonProperty("recall_compliance")
    public void setRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    @JsonProperty("tax_category")
    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    @JsonProperty("tax_category")
    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    @JsonProperty("display_option")
    public DisplayOption getDisplayOption() {
        return displayOption;
    }

    @JsonProperty("display_option")
    public void setDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    @JsonProperty("package_dimensions")
    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    @JsonProperty("package_dimensions")
    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    @JsonProperty("environmental_segmentation")
    public EnvironmentalSegmentation getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    @JsonProperty("environmental_segmentation")
    public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    @JsonProperty("manufacturer")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("product_vendors")
    public List<ProductVendor> getProductVendors() {
        return productVendors;
    }

    @JsonProperty("product_vendors")
    public void setProductVendors(List<ProductVendor> productVendors) {
        this.productVendors = productVendors;
    }

    @JsonProperty("product_classification")
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    @JsonProperty("product_classification")
    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    @JsonProperty("product_brand")
    public ProductBrand getProductBrand() {
        return productBrand;
    }

    @JsonProperty("product_brand")
    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    @JsonProperty("item_state")
    public String getItemState() {
        return itemState;
    }

    @JsonProperty("item_state")
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    @JsonProperty("specifications")
    public List<Object> getSpecifications() {
        return specifications;
    }

    @JsonProperty("specifications")
    public void setSpecifications(List<Object> specifications) {
        this.specifications = specifications;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("country_of_origin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("country_of_origin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @JsonProperty("relationship_type_code")
    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    @JsonProperty("relationship_type_code")
    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    @JsonProperty("subscription_eligible")
    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    @JsonProperty("subscription_eligible")
    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

    @JsonProperty("ribbons")
    public List<Object> getRibbons() {
        return ribbons;
    }

    @JsonProperty("ribbons")
    public void setRibbons(List<Object> ribbons) {
        this.ribbons = ribbons;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("estore_item_status_code")
    public String getEstoreItemStatusCode() {
        return estoreItemStatusCode;
    }

    @JsonProperty("estore_item_status_code")
    public void setEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
    }

    @JsonProperty("eligibility_rules")
    public EligibilityRules getEligibilityRules() {
        return eligibilityRules;
    }

    @JsonProperty("eligibility_rules")
    public void setEligibilityRules(EligibilityRules eligibilityRules) {
        this.eligibilityRules = eligibilityRules;
    }

    @JsonProperty("return_policies")
    public ReturnPolicies getReturnPolicies() {
        return returnPolicies;
    }

    @JsonProperty("return_policies")
    public void setReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
    }

    @JsonProperty("gifting_enabled")
    public Boolean getGiftingEnabled() {
        return giftingEnabled;
    }

    @JsonProperty("gifting_enabled")
    public void setGiftingEnabled(Boolean giftingEnabled) {
        this.giftingEnabled = giftingEnabled;
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
		return "Item [tcin=" + tcin + ", bundleComponents=" + bundleComponents + ", dpci=" + dpci + ", upc=" + upc
				+ ", productDescription=" + productDescription + ", parentItems=" + parentItems + ", buyUrl=" + buyUrl
				+ ", variation=" + variation + ", enrichment=" + enrichment + ", returnMethod=" + returnMethod
				+ ", handling=" + handling + ", recallCompliance=" + recallCompliance + ", taxCategory=" + taxCategory
				+ ", displayOption=" + displayOption + ", fulfillment=" + fulfillment + ", packageDimensions="
				+ packageDimensions + ", environmentalSegmentation=" + environmentalSegmentation + ", manufacturer="
				+ manufacturer + ", productVendors=" + productVendors + ", productClassification="
				+ productClassification + ", productBrand=" + productBrand + ", itemState=" + itemState
				+ ", specifications=" + specifications + ", attributes=" + attributes + ", countryOfOrigin="
				+ countryOfOrigin + ", relationshipTypeCode=" + relationshipTypeCode + ", subscriptionEligible="
				+ subscriptionEligible + ", ribbons=" + ribbons + ", tags=" + tags + ", estoreItemStatusCode="
				+ estoreItemStatusCode + ", eligibilityRules=" + eligibilityRules + ", returnPolicies=" + returnPolicies
				+ ", giftingEnabled=" + giftingEnabled + ", additionalProperties=" + additionalProperties + "]";
	}

}
