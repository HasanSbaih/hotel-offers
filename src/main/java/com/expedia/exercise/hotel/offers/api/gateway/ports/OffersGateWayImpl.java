package com.expedia.exercise.hotel.offers.api.gateway.ports;

import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;
import com.expedia.exercise.hotel.offers.api.gateway.model.gateway.OffersGateWay;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchRequest;
import com.expedia.exercise.hotel.offers.api.gateway.ports.pojos.Hotel;
import com.expedia.exercise.hotel.offers.api.gateway.ports.pojos.OffersRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class OffersGateWayImpl implements OffersGateWay {

    public static final String SERVICE_URL = "https://offersvc.expedia.com";
    public static final String SERVICE_PATH = "/offers/v2/getOffers";


    private RestTemplate restTemplate = new RestTemplate() ;

    @Override
    public List<HotelOfferDto> getHotelOffers(SearchRequest request) {
        OffersRequest quote = askServiceForOffersUsing(request);
        List<HotelOfferDto> hotelOffers = new ArrayList<>();
        quote.getOffers().getHotel().forEach(hotel -> buildHotelDto(hotelOffers, hotel));
        return hotelOffers;
    }

    private void buildHotelDto(List<HotelOfferDto> hotelOffers, Hotel hotel) {
        HotelOffer.Builder offerBuilder = new HotelOffer.Builder();
        offerBuilder.setName(hotel.getHotelInfo().getHotelName());
        offerBuilder.setAverageRate(hotel.getHotelInfo().getHotelStarRating());
        offerBuilder.setCityName(hotel.getHotelInfo().getHotelCity());
        offerBuilder.setDescription(hotel.getHotelInfo().getPromotionDescription());
        offerBuilder.setImageUrl(hotel.getHotelInfo().getHotelImageUrl());
        offerBuilder.setCarPackage(hotel.getHotelInfo().getCarPackage());
        hotelOffers.add(offerBuilder.build());
    }

    private OffersRequest askServiceForOffersUsing(SearchRequest request) {
        URI targetUrl = buildServiceLocationAndRequestParams(request);

        return restTemplate.getForObject(targetUrl,OffersRequest.class);
    }

    private URI buildServiceLocationAndRequestParams(SearchRequest request) {
        UriComponentsBuilder uriBuilder = buildInitialUrlAndApiToken();

        addUrlParameters(request, uriBuilder);
        return uriBuilder.build().toUri();
    }

    private void addUrlParameters(SearchRequest request, UriComponentsBuilder uriBuilder) {
        addParam(uriBuilder,"destinationCity", request.getDestinationCity());
        addParam(uriBuilder,"destinationName", request.getDestinationName());
        addParam(uriBuilder,"regionIds", request.getRegionIds());
        addParam(uriBuilder,"minTripStartDate", request.getMinTripStartDate());
        addParam(uriBuilder,"maxTripStartDate", request.getMaxTripStartDate());
        addParam(uriBuilder,"lengthOfStay", request.getLengthOfStay());
        addParam(uriBuilder,"minStarRating", request.getMinStarRating());
        addParam(uriBuilder,"maxStarRating", request.getMaxStarRating());
        addParam(uriBuilder,"minGuestRating", request.getMinGuestRating());
        addParam(uriBuilder,"maxGuestRating", request.getMaxGuestRating());
        addParam(uriBuilder,"minTotalRate", request.getMinTotalRate());
        addParam(uriBuilder,"maxTotalRate", request.getMaxTotalRate());
    }

    void addParam(UriComponentsBuilder uriBuilder ,String key,String value){
        if (StringUtils.isBlank(value))
            return;
        uriBuilder.queryParam(key, value);
    }

    private UriComponentsBuilder buildInitialUrlAndApiToken() {
        return UriComponentsBuilder.fromUriString(SERVICE_URL)
                .path(SERVICE_PATH)
                .queryParam("scenario", "deal-finder")
                .queryParam("page", "foo")
                .queryParam("uid", "foo")
                .queryParam("productType", "Hotel");
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
