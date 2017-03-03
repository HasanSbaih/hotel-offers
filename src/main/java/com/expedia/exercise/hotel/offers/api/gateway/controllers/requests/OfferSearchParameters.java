package com.expedia.exercise.hotel.offers.api.gateway.controllers.requests;

import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchRequest;

public class OfferSearchParameters implements SearchRequest{
    private String destinationName;
    private String destinationCity;
    private String regionIds;
    private String minTripStartDate;
    private String maxTripStartDate;
    private String lengthOfStay;
    private String minStarRating;
    private String maxStarRating;
    private String minGuestRating;
    private String maxGuestRating;
    private String minTotalRate;
    private String maxTotalRate;

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(String regionIds) {
        this.regionIds = regionIds;
    }

    public String getMinTripStartDate() {
        return minTripStartDate;
    }

    public void setMinTripStartDate(String minTripStartDate) {
        this.minTripStartDate = minTripStartDate;
    }

    public String getMaxTripStartDate() {
        return maxTripStartDate;
    }

    public void setMaxTripStartDate(String maxTripStartDate) {
        this.maxTripStartDate = maxTripStartDate;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public String getMinStarRating() {
        return minStarRating;
    }

    public void setMinStarRating(String minStarRating) {
        this.minStarRating = minStarRating;
    }

    public String getMaxStarRating() {
        return maxStarRating;
    }

    public void setMaxStarRating(String maxStarRating) {
        this.maxStarRating = maxStarRating;
    }

    public String getMinGuestRating() {
        return minGuestRating;
    }

    public void setMinGuestRating(String minGuestRating) {
        this.minGuestRating = minGuestRating;
    }

    public String getMaxGuestRating() {
        return maxGuestRating;
    }

    public void setMaxGuestRating(String maxGuestRating) {
        this.maxGuestRating = maxGuestRating;
    }

    public String getMinTotalRate() {
        return minTotalRate;
    }

    public void setMinTotalRate(String minTotalRate) {
        this.minTotalRate = minTotalRate;
    }

    public String getMaxTotalRate() {
        return maxTotalRate;
    }

    public void setMaxTotalRate(String maxTotalRate) {
        this.maxTotalRate = maxTotalRate;
    }
}
