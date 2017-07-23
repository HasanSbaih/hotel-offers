package com.expedia.exercise.hotel.offers.api.gateway.controllers;

import com.expedia.exercise.hotel.offers.api.gateway.controllers.requests.OfferSearchParameters;
import com.expedia.exercise.hotel.offers.api.gateway.controllers.requests.OfferSearchResponse;
import com.expedia.exercise.hotel.offers.api.gateway.model.SearchUseCaseContext;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchForAnOffer;
import com.expedia.exercise.hotel.offers.api.gateway.ports.ApplicationSearchUseCaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class SearchController {
    @Autowired
    private SearchUseCaseContext context ;

    @CrossOrigin
    @RequestMapping(name = "/search", method = RequestMethod.POST)
    public OfferSearchResponse search(@RequestBody OfferSearchParameters offerSearchParams) {
        final OfferSearchResponse response = new OfferSearchResponse();

        new SearchForAnOffer(context).execute(offerSearchParams, offer -> response.getOffers().add(offer) );

        return response;
    }
    @CrossOrigin
    @RequestMapping(name = "/search", method = RequestMethod.GET )
    public OfferSearchResponse getAllData() {
        final OfferSearchResponse response = new OfferSearchResponse();

        new SearchForAnOffer(context).execute(new OfferSearchParameters(), offer -> response.getOffers().add(offer) );

        return response;
    }

}