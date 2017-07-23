package com.expedia.exercise.hotel.offers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value = {"com.expedia.exercise.hotel.offers.api.gateway.ports","com.expedia.exercise.hotel.offers.api.gateway.controllers"})

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
