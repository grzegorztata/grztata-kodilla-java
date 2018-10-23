package com.kodilla.good.patterns.flight.base;

import java.util.HashSet;

public class Airports {

    Destinations gdansk = new Destinations("Gdansk");
    Destinations krakow = new Destinations("Krakow");
    Destinations wroclaw = new Destinations("Wroclaw");

    public HashSet<Destinations> citiesHashSet() {

        HashSet<Destinations> flights = new HashSet<>();
        flights.add(gdansk);
        flights.add(krakow);
        flights.add(wroclaw);

        wroclaw.addDirection(gdansk);
        wroclaw.addDirection(krakow);
        krakow.addDirection(wroclaw);
        gdansk.addDirection(wroclaw);

        return flights;
    }
}