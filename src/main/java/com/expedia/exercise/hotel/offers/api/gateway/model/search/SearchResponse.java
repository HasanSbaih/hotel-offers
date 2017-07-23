package com.expedia.exercise.hotel.offers.api.gateway.model.search;

import com.expedia.exercise.development.Response;
import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;


public interface SearchResponse extends Response{
    void addOffer(HotelOfferDto offer);
}
