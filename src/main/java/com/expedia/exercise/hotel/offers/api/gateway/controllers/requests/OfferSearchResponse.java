package com.expedia.exercise.hotel.offers.api.gateway.controllers.requests;

import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by u562 on 3/3/2017.
 */
public class OfferSearchResponse {
    private  List<HotelOfferDto> offers = new ArrayList<>();

    public List<HotelOfferDto> getOffers() {
        return offers;
    }

    public void setOffers(List<HotelOfferDto> offers) {
        this.offers = offers;
    }
}
