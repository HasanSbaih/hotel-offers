
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "averagePriceValue",
    "totalPriceValue",
    "originalPricePerNight",
    "hotelTotalBaseRate",
    "hotelTotalTaxesAndFees",
    "currency",
    "hotelTotalMandatoryTaxesAndFees",
    "percentSavings",
    "drr"
})
public class HotelPricingInfo implements Serializable
{

    @JsonProperty("averagePriceValue")
    private Double averagePriceValue;
    @JsonProperty("totalPriceValue")
    private Double totalPriceValue;
    @JsonProperty("originalPricePerNight")
    private String originalPricePerNight;
    @JsonProperty("hotelTotalBaseRate")
    private Double hotelTotalBaseRate;
    @JsonProperty("hotelTotalTaxesAndFees")
    private Double hotelTotalTaxesAndFees;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    private Double hotelTotalMandatoryTaxesAndFees;
    @JsonProperty("percentSavings")
    private Double percentSavings;
    @JsonProperty("drr")
    private Boolean drr;
    private final static long serialVersionUID = 6982919556358386341L;

    @JsonProperty("averagePriceValue")
    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    @JsonProperty("averagePriceValue")
    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    @JsonProperty("totalPriceValue")
    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    @JsonProperty("totalPriceValue")
    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    @JsonProperty("originalPricePerNight")
    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    @JsonProperty("originalPricePerNight")
    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    @JsonProperty("hotelTotalBaseRate")
    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    @JsonProperty("hotelTotalBaseRate")
    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    @JsonProperty("hotelTotalTaxesAndFees")
    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    @JsonProperty("hotelTotalTaxesAndFees")
    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    public Double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    @JsonProperty("percentSavings")
    public Double getPercentSavings() {
        return percentSavings;
    }

    @JsonProperty("percentSavings")
    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    @JsonProperty("drr")
    public Boolean getDrr() {
        return drr;
    }

    @JsonProperty("drr")
    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

}
