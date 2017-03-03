package com.expedia.exercise.hotel.offers.api.gateway.model.dto;

/**
 * Created by u562 on 3/3/2017.
 */
public interface HotelOfferDto {

    String getName();

    String getCityName();

    String getAverageRate();

    String getDescription();

    String getImageUrl();

    Boolean getCarPackage();
}
