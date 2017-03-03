package com.expedia.exercise.hotel.offers.api.gateway.ports;

import com.expedia.exercise.hotel.offers.api.gateway.model.dto.HotelOfferDto;

/**
 * Created by u562 on 3/3/2017.
 */
public class HotelOffer implements HotelOfferDto{
    private String name;
    private String cityName;
    private String averageRate;
    private String description;
    private String imageUrl;
    private Boolean carPackage;

    private HotelOffer () {}

    public String getName() {
        return name;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAverageRate() {
        return averageRate;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Boolean getCarPackage() {
        return carPackage;
    }


    public static class Builder {
        private HotelOffer hotelOffer;
        public Builder(){
            this.hotelOffer = new HotelOffer();
        }

        public void setName(String name) {
            hotelOffer.name = name;
        }

        public void setCityName(String cityName) {
            hotelOffer.cityName = cityName;
        }

        public void setAverageRate(String averageRate) {
            hotelOffer.averageRate = averageRate;
        }

        public void setDescription(String description) {
            hotelOffer.description = description;
        }

        public void setImageUrl(String imageUrl) {
            hotelOffer.imageUrl = imageUrl;
        }

        public void setCarPackage(Boolean carPackage) {
            hotelOffer.carPackage = carPackage;
        }
        public HotelOffer build(){
            return this.hotelOffer;
        }
    }
}
