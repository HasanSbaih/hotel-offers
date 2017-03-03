package com.expedia.exercise.hotel.offers.api.gateway.ports;

import com.expedia.exercise.hotel.offers.api.gateway.model.Context;
import com.expedia.exercise.hotel.offers.api.gateway.model.gateway.OffersGateWay;

/**
 * Created by u562 on 3/3/2017.
 */
public class ApplicationContext implements Context{
    @Override
    public OffersGateWay offersGateWay() {
        return new OffersGateWayImpl();
    }
}
