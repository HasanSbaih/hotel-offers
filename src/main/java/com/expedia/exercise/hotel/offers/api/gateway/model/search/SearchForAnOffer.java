package com.expedia.exercise.hotel.offers.api.gateway.model.search;

import com.expedia.exercise.development.UseCase;
import com.expedia.exercise.hotel.offers.api.gateway.model.SearchUseCaseContext;


public class SearchForAnOffer implements UseCase<SearchRequest,SearchResponse> {

    private final SearchUseCaseContext context;

    public SearchForAnOffer(SearchUseCaseContext context) {
        this.context = context;
    }


    @Override
    public void execute(SearchRequest request, SearchResponse response) {
        context.offersGateWay().getHotelOffers(request).forEach(offer-> response.addOffer(offer));
    }
}
