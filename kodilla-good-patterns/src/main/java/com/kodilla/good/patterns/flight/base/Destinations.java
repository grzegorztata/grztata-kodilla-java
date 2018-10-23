package com.kodilla.good.patterns.flight.base;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Destinations {

    private final String city;
    private final Set<Destinations> flights = new HashSet<>();

    public Destinations(String city) {
        this.city = city;
    }

    public void addDirection(Destinations city){
        flights.add(city);
    }

    public String getCity() {
        return city;
    }

    public Set<Destinations> getFlights() {
        return flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destinations destinations = (Destinations) o;
        return Objects.equals(city, destinations.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(city);
    }
}
