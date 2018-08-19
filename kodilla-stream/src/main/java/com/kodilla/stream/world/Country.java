package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements Population {
    private final String countryName;
    private final BigDecimal countriesPopulation;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.countriesPopulation = peopleQuantity;
    }
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + countriesPopulation +
                '}';
    }
    @Override
    public BigDecimal getPeopleQuantity() {
        return countriesPopulation;
    }
}