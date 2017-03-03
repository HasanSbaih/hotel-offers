
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airAttachRemainingTime",
    "numberOfPeopleViewing",
    "numberOfPeopleBooked",
    "numberOfRoomsLeft",
    "lastBookedTime",
    "almostSoldStatus",
    "link",
    "almostSoldOutRoomTypeInfoCollection",
    "airAttachEnabled"
})
public class HotelUrgencyInfo implements Serializable
{

    @JsonProperty("airAttachRemainingTime")
    private Integer airAttachRemainingTime;
    @JsonProperty("numberOfPeopleViewing")
    private Integer numberOfPeopleViewing;
    @JsonProperty("numberOfPeopleBooked")
    private Integer numberOfPeopleBooked;
    @JsonProperty("numberOfRoomsLeft")
    private Integer numberOfRoomsLeft;
    @JsonProperty("lastBookedTime")
    private Long lastBookedTime;
    @JsonProperty("almostSoldStatus")
    private String almostSoldStatus;
    @JsonProperty("link")
    private String link;
    @JsonProperty("almostSoldOutRoomTypeInfoCollection")
    private List<Object> almostSoldOutRoomTypeInfoCollection = null;
    @JsonProperty("airAttachEnabled")
    private Boolean airAttachEnabled;
    private final static long serialVersionUID = 1725411830132213084L;

    @JsonProperty("airAttachRemainingTime")
    public Integer getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    @JsonProperty("airAttachRemainingTime")
    public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    @JsonProperty("numberOfPeopleViewing")
    public Integer getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    @JsonProperty("numberOfPeopleViewing")
    public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    @JsonProperty("numberOfPeopleBooked")
    public Integer getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    @JsonProperty("numberOfPeopleBooked")
    public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    @JsonProperty("numberOfRoomsLeft")
    public Integer getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    @JsonProperty("numberOfRoomsLeft")
    public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    @JsonProperty("lastBookedTime")
    public Long getLastBookedTime() {
        return lastBookedTime;
    }

    @JsonProperty("lastBookedTime")
    public void setLastBookedTime(Long lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    @JsonProperty("almostSoldStatus")
    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    @JsonProperty("almostSoldStatus")
    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("almostSoldOutRoomTypeInfoCollection")
    public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    @JsonProperty("almostSoldOutRoomTypeInfoCollection")
    public void setAlmostSoldOutRoomTypeInfoCollection(List<Object> almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    @JsonProperty("airAttachEnabled")
    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    @JsonProperty("airAttachEnabled")
    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

}
