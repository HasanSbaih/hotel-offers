
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rawAppealScore",
    "movingAverageScore"
})
public class HotelScores implements Serializable
{

    @JsonProperty("rawAppealScore")
    private Double rawAppealScore;
    @JsonProperty("movingAverageScore")
    private Double movingAverageScore;
    private final static long serialVersionUID = 7401446458616777675L;

    @JsonProperty("rawAppealScore")
    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    @JsonProperty("rawAppealScore")
    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    @JsonProperty("movingAverageScore")
    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    @JsonProperty("movingAverageScore")
    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

}
