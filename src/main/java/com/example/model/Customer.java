package com.example.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "_id",
        "CustomerID",
        "CompanyName",
        "ContactName",
        "ContactTitle",
        "Address",
        "City",
        "Region",
        "PostalCode",
        "Country",
        "Phone",
        "Fax"
})
@Document
public class Customer {

    @JsonProperty("_id")
    @Id
    private String Id;
    @JsonProperty("CustomerID")
    private String CustomerID;
    @JsonProperty("CompanyName")
    private String CompanyName;
    @JsonProperty("ContactName")
    private String ContactName;
    @JsonProperty("ContactTitle")
    private String ContactTitle;
    @JsonProperty("Address")
    private String Address;
    @JsonProperty("City")
    private String City;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("PostalCode")
    private String PostalCode;
    @JsonProperty("Country")
    @Field("country")
    private String Country;
    private String countryLc;
    @JsonProperty("Phone")
    private String Phone;
    @JsonProperty("Fax")
    private String Fax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return Id;
    }

    /**
     * @param Id The _id
     */
    @JsonProperty("_id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return The CustomerID
     */
    @JsonProperty("CustomerID")
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID The CustomerID
     */
    @JsonProperty("CustomerID")
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return The CompanyName
     */
    @JsonProperty("CompanyName")
    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * @param CompanyName The CompanyName
     */
    @JsonProperty("CompanyName")
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * @return The ContactName
     */
    @JsonProperty("ContactName")
    public String getContactName() {
        return ContactName;
    }

    /**
     * @param ContactName The ContactName
     */
    @JsonProperty("ContactName")
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * @return The ContactTitle
     */
    @JsonProperty("ContactTitle")
    public String getContactTitle() {
        return ContactTitle;
    }

    /**
     * @param ContactTitle The ContactTitle
     */
    @JsonProperty("ContactTitle")
    public void setContactTitle(String ContactTitle) {
        this.ContactTitle = ContactTitle;
    }

    /**
     * @return The Address
     */
    @JsonProperty("Address")
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address The Address
     */
    @JsonProperty("Address")
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return The City
     */
    @JsonProperty("City")
    public String getCity() {
        return City;
    }

    /**
     * @param City The City
     */
    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return The Region
     */
    @JsonProperty("Region")
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region The Region
     */
    @JsonProperty("Region")
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * @return The PostalCode
     */
    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode The PostalCode
     */
    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountryLc() {
        return Country;
    }

    public void setCountryLc(String countryLc) {
        this.Country = countryLc;
    }

    /**
     * @return The Phone
     */
    @JsonProperty("Phone")
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone The Phone
     */
    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return The Fax
     */
    @JsonProperty("Fax")
    public String getFax() {
        return Fax;
    }

    /**
     * @param Fax The Fax
     */
    @JsonProperty("Fax")
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


