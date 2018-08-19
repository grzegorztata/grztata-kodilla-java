package com.kodilla.exception.test;

public class AirportChecking {
    public static void main(String[] args) {

        AirportLocation  airportLocation = new AirportLocation();
        Flight flight = new Flight("KRK", "Warsaw");

        try {
            airportLocation.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("You cannot flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        }
    }
}
