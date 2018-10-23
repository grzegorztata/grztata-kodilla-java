package com.kodilla.good.patterns.flight.checkandgo;

import com.kodilla.good.patterns.flight.base.Airports;
import com.kodilla.good.patterns.flight.base.Destinations;
import com.kodilla.good.patterns.flight.RequestInformation;

public class FlightsBy implements RouteFinder {

    Airports airports = new Airports();

    @Override
    public void findTheFlight(RequestInformation requestInformation) {
        Destinations cityFrom = new Destinations((requestInformation.getCityFrom()));
        Destinations cityTo = new Destinations((requestInformation.getCityTo()));

        long direct = airports.citiesHashSet().stream()
                .filter(f -> f.equals(cityFrom))
                .flatMap(l -> l.getFlights().stream())
                .filter(d -> d.equals(cityTo))
                .map(m -> m.getCity())
                .count();

        long indirect = airports.citiesHashSet().stream()
                .filter(f -> f.equals(cityFrom))
                .flatMap(l -> l.getFlights().stream())
                .flatMap(n -> n.getFlights().stream())
                .filter(d -> d.equals(cityTo))
                .map(m -> m.getCity())
                .count();

        if (direct == 1) {
            System.out.println("The connection from " + requestInformation.getCityFrom() + " to " + requestInformation.getCityTo() + " exists");
        } else {
            System.out.println("The connection from " + requestInformation.getCityFrom() + " to " + requestInformation.getCityTo() + " doesn't exist or you wrote wrong cities");
        }

        if (indirect >= 1) {
            System.out.println("You should change the flight" + indirect + " times");
        }
    }
}