package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country finland = new Country("Finland", new BigDecimal("5518371"));
        Country iceland = new Country("Iceland", new BigDecimal("339747"));
        Country poland = new Country("Poland", new BigDecimal("38476269"));
        Country angola = new Country("Angola", new BigDecimal("29310273"));
        Country lesotho = new Country("Lesotho", new BigDecimal("1958042"));
        Country nigeria = new Country("Nigeria", new BigDecimal("190632261"));
        Country china = new Country("China", new BigDecimal("1379302771"));
        Country japan = new Country("Japan", new BigDecimal("126451398"));
        Country iran = new Country("Iran", new BigDecimal("82021564"));
        Country brasil = new Country("Brasil", new BigDecimal("207353391"));
        Country belize = new Country("Belize", new BigDecimal("360346"));
        Country costarica = new Country("Costarica", new BigDecimal("4930258"));
        Continent countriesEurope = new Continent("Europe");
        Continent countriesAfrica = new Continent("Africa");
        Continent countriesAsia = new Continent("Asia");
        Continent countriesAmerica = new Continent("America");

        countriesEurope.addCountry(finland);
        countriesEurope.addCountry(iceland);
        countriesEurope.addCountry(poland);
        countriesAfrica.addCountry(angola);
        countriesAfrica.addCountry(lesotho);
        countriesAfrica.addCountry(nigeria);
        countriesAsia.addCountry(china);
        countriesAsia.addCountry(japan);
        countriesAsia.addCountry(iran);
        countriesAmerica.addCountry(brasil);
        countriesAmerica.addCountry(belize);
        countriesAmerica.addCountry(costarica);

        World world = new World();
        world.addContinent(countriesEurope);
        world.addContinent(countriesAfrica);
        world.addContinent(countriesAsia);
        world.addContinent(countriesAmerica);

        //When
        BigDecimal worldsPopulation = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("2066654691"), worldsPopulation); //działa
    }
}