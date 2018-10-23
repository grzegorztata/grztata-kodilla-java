package com.kodilla.good.patterns.flight.checkandgo;

import com.kodilla.good.patterns.flight.base.Airports;
import com.kodilla.good.patterns.flight.base.Destinations;
import com.kodilla.good.patterns.flight.RequestInformation;

public class Departures implements RouteFinder {

    Airports airports = new Airports();

    public void findTheFlight(RequestInformation requestInformation) {
        Destinations cityFrom = new Destinations((requestInformation.getCityFrom()));

        airports.citiesHashSet().stream()
                .filter(f -> f.equals(cityFrom))
                .flatMap(l -> l.getFlights().stream())
                .map(m -> m.getCity())
                .forEach(System.out::println);
    }
}

