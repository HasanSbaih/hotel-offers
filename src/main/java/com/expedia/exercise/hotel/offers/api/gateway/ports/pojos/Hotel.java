
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerDateRange",
    "destination",
    "hotelInfo",
    "hotelUrgencyInfo",
    "hotelPricingInfo",
    "hotelUrls",
    "hotelScores"
})
public class Hotel implements Serializable
{

    @JsonProperty("offerDateRange")
    private OfferDateRange offerDateRange;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("hotelInfo")
    private HotelInfo hotelInfo;
    @JsonProperty("hotelUrgencyInfo")
    private HotelUrgencyInfo hotelUrgencyInfo;
    @JsonProperty("hotelPricingInfo")
    private HotelPricingInfo hotelPricingInfo;
    @JsonProperty("hotelUrls")
    private HotelUrls hotelUrls;
    @JsonProperty("hotelScores")
    private HotelScores hotelScores;
    private final static long serialVersionUID = 3514459740353857729L;

    @JsonProperty("offerDateRange")
    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    @JsonProperty("offerDateRange")
    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("hotelInfo")
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    @JsonProperty("hotelInfo")
    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    @JsonProperty("hotelUrgencyInfo")
    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    @JsonProperty("hotelUrgencyInfo")
    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    @JsonProperty("hotelPricingInfo")
    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    @JsonProperty("hotelUrls")
    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    @JsonProperty("hotelUrls")
    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    @JsonProperty("hotelScores")
    public HotelScores getHotelScores() {
        return hotelScores;
    }

    @JsonProperty("hotelScores")
    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }

}
