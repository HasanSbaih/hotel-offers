package com.expedia.exercise.hotel.offers.api.gateway.model.gateway;


import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchRequest;

import java.util.List;


public interface OffersGateWay {

    List<HotelOfferDto> getHotelOffers(SearchRequest request);
}
