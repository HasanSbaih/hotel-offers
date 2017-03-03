
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Hotel"
})
public class Offers implements Serializable
{

    @JsonProperty("Hotel")
    private List<Hotel> hotel = null;
    private final static long serialVersionUID = -3743063641112700028L;

    @JsonProperty("Hotel")
    public List<Hotel> getHotel() {
        return hotel;
    }

    @JsonProperty("Hotel")
    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

}
