package com.kodilla.good.patterns.flight.checkandgo;

import com.kodilla.good.patterns.flight.base.Airports;
import com.kodilla.good.patterns.flight.base.Destinations;
import com.kodilla.good.patterns.flight.RequestInformation;

public class Arrivals implements RouteFinder {

    Airports airports = new Airports();

    public void findTheFlight(RequestInformation requestInformation) {
        Destinations cityTo = new Destinations((requestInformation.getCityFrom()));

        airports.citiesHashSet().stream()
                .filter(f -> f.getFlights().contains(cityTo))
                .map(m -> m.getCity())
                .forEach(System.out::println);
    }
}
