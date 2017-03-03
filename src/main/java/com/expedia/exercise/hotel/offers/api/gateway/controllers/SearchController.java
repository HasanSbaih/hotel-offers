package com.expedia.exercise.hotel.offers.api.gateway.controllers;

import com.expedia.exercise.hotel.offers.api.gateway.controllers.requests.OfferSearchParameters;
import com.expedia.exercise.hotel.offers.api.gateway.controllers.requests.OfferSearchResponse;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchForAnOffer;
import com.expedia.exercise.hotel.offers.api.gateway.ports.ApplicationContext;
import org.springframework.web.bind.annotation.*;

/**
 * Created by u562 on 3/1/2017.
 */
@CrossOrigin
@RestController
public class SearchController {

    @CrossOrigin
    @RequestMapping(name = "/search", method = RequestMethod.POST)
    public OfferSearchResponse search(@RequestBody OfferSearchParameters offerSearchParams) {
        final OfferSearchResponse response = new OfferSearchResponse();

        new SearchForAnOffer(new ApplicationContext()).execute(offerSearchParams, offer -> response.getOffers().add(offer) );

        return response;
    }
    @CrossOrigin
    @RequestMapping(name = "/search", method = RequestMethod.GET )
    public OfferSearchResponse getAllData() {
        final OfferSearchResponse response = new OfferSearchResponse();

        new SearchForAnOffer(new ApplicationContext()).execute(new OfferSearchParameters(), offer -> response.getOffers().add(offer) );

        return response;
    }

}
