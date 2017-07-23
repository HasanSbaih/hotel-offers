package com.expedia.exercise.hotel.offers.api.gateway.ports;

import com.expedia.exercise.hotel.offers.api.gateway.model.SearchUseCaseContext;
import com.expedia.exercise.hotel.offers.api.gateway.model.gateway.OffersGateWay;
import org.springframework.stereotype.Component;

@Component
public class ApplicationSearchUseCaseContext implements SearchUseCaseContext {

    private OffersGateWay offersGateWayImpl = new OffersGateWayImpl();

    @Override
    public OffersGateWay offersGateWay() {
        return offersGateWayImpl;
    }

}
