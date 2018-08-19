package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportLocation {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Helsinki", true);
        airports.put("Reykjavik", false);
        airports.put("Oslo", true);
        airports.put("Stockholm", false);
        airports.put("Copenhagen", false);


        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            System.out.println("You cannot choose the same airport");
            return "NO";
        } else if (airports.containsKey(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available. Have a nice flight!");
            return "OK";
        } else {
            throw new RouteNotFoundException("No Airport");
        }
    }
}
