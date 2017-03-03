package com.expedia.exercise.hotel.offers.api.gateway.controllers;

import com.expedia.exercise.hotel.offers.api.gateway.controllers.requests.OfferSearchParameters;
import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchForAnOffer;
import com.expedia.exercise.hotel.offers.api.gateway.ports.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by u562 on 3/1/2017.
 */
@RestController
public class SearchController {

    @RequestMapping(name = "/search", method = RequestMethod.POST)
    public List<HotelOfferDto> search(@RequestBody OfferSearchParameters offerSearchParams) {
        final List<HotelOfferDto> offersToView = new ArrayList<>();

        new SearchForAnOffer(new ApplicationContext()).execute(offerSearchParams, offer -> offersToView.add(offer) );

        return offersToView;
    }

}
