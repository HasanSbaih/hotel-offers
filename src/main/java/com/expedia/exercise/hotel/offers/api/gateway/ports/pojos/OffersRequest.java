
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerInfo",
    "userInfo",
    "offers"
})
public class OffersRequest implements Serializable
{

    @JsonProperty("offerInfo")
    private OfferInfo offerInfo;
    @JsonProperty("userInfo")
    private UserInfo userInfo;
    @JsonProperty("offers")
    private Offers offers;
    private final static long serialVersionUID = 336513426220692968L;

    @JsonProperty("offerInfo")
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    @JsonProperty("offerInfo")
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    @JsonProperty("userInfo")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    @JsonProperty("userInfo")
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @JsonProperty("offers")
    public Offers getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

}
