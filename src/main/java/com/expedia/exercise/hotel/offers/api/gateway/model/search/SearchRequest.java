package com.expedia.exercise.hotel.offers.api.gateway.model.search;

import com.expedia.exercise.development.Request;


public interface SearchRequest extends Request {
    String getDestinationName();

    String getDestinationCity();

    String getRegionIds();

    String getMinTripStartDate();

    String getMaxTripStartDate();

    String getLengthOfStay();

    String getMinStarRating();

    String getMaxStarRating();

    String getMinGuestRating();

    String getMaxGuestRating();

    String getMinTotalRate();

    String getMaxTotalRate();
}