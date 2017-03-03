
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "regionID",
    "longName",
    "country",
    "province",
    "city"
})
public class Destination implements Serializable
{

    @JsonProperty("regionID")
    private String regionID;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    private final static long serialVersionUID = -8220216087939610267L;

    @JsonProperty("regionID")
    public String getRegionID() {
        return regionID;
    }

    @JsonProperty("regionID")
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

}
