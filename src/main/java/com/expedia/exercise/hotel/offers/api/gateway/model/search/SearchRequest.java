package com.expedia.exercise.hotel.offers.api.gateway.model.search;

import com.expedia.exercise.development.Request;

/**
 * Created by u562 on 3/1/2017.
 */
public interface SearchRequest extends Request {
    public String getDestinationName();

    public String getDestinationCity();

    public String getRegionIds();

    public String getMinTripStartDate();

    public String getMaxTripStartDate();

    public String getLengthOfStay();

    public String getMinStarRating();

    public String getMaxStarRating();

    public String getMinGuestRating();

    public String getMaxGuestRating();

    public String getMinTotalRate();

    public String getMaxTotalRate();
}