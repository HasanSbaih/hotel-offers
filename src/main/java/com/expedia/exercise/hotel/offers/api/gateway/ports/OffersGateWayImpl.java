package com.expedia.exercise.hotel.offers.api.gateway.ports;

import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;
import com.expedia.exercise.hotel.offers.api.gateway.model.gateway.OffersGateWay;
import com.expedia.exercise.hotel.offers.api.gateway.model.search.SearchRequest;
import com.expedia.exercise.hotel.offers.api.gateway.ports.pojos.Hotel;
import com.expedia.exercise.hotel.offers.api.gateway.ports.pojos.OffersRequest;
import org.springframework.beans.factory.annotation.Autowired;
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
        return UriComponentsBuilder.fromUriString(SERVICE_URL)
                        .path(SERVICE_PATH)
                        .queryParam("scenario","deal-finder")
                        .queryParam("page","foo")
                        .queryParam("uid","foo")
                        .queryParam("productType","Hotel")
                        .queryParam("destinationCity",request.getDestinationCity())
                        .queryParam("destinationName",request.getDestinationName())
                        .queryParam("regionIds",request.getRegionIds())
                        .queryParam("minTripStartDate",request.getMinTripStartDate())
                        .queryParam("maxTripStartDate",request.getMaxTripStartDate())
                        .queryParam("lengthOfStay",request.getLengthOfStay())
                        .queryParam("minStarRating",request.getMinStarRating())
                        .queryParam("maxStarRating",request.getMaxStarRating())
                        .queryParam("minGuestRating",request.getMinGuestRating())
                        .queryParam("maxGuestRating",request.getMaxGuestRating())
                        .queryParam("minTotalRate",request.getMinTotalRate())
                        .queryParam("maxTotalRate",request.getMaxTotalRate())
                        .build().toUri();
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
