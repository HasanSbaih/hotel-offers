package com.expedia.exercise.hotel.offers.api.gateway.model.search;

import com.expedia.exercise.development.UseCase;
import com.expedia.exercise.hotel.offers.api.gateway.model.Context;

/**
 * Created by u562 on 3/1/2017.
 */
public class SearchForAnOffer implements UseCase<SearchRequest,SearchResponse> {

    private final Context context;

    public SearchForAnOffer(Context context) {
        this.context = context;
    }


    @Override
    public void execute(SearchRequest request, SearchResponse response) {
        context.offersGateWay().getHotelOffers(request).forEach(offer-> response.addOffer(offer));
    }
}
