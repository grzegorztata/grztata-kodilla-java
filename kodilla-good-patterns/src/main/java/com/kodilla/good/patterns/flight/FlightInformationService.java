package com.kodilla.good.patterns.flight;

import com.kodilla.good.patterns.flight.checkandgo.RouteFinder;

public class FlightInformationService {

    private RouteFinder routeFinder;

    public FlightInformationService(final RouteFinder routeFinder) {
        this.routeFinder = routeFinder;
    }

    public void process (com.kodilla.good.patterns.flight.RequestInformation requestInformation) {

        routeFinder.findTheFlight(requestInformation);
    }
}
