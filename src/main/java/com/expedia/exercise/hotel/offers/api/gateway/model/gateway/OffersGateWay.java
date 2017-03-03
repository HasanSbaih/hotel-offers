package com.expedia.exercise.hotel.offers.api.gateway.model.gateway;


import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchRequest;

import java.util.List;

/**
 * Created by u562 on 3/1/2017.
 */
public interface OffersGateWay {

    List<HotelOfferDto> getHotelOffers(SearchRequest request);
}
