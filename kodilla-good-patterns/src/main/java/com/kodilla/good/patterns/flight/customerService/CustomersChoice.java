package com.kodilla.good.patterns.flight.customersService;

import com.kodilla.good.patterns.flight.checkandgo.RouteFinder;
import com.kodilla.good.patterns.flight.checkandgo.FlightsBy;
import com.kodilla.good.patterns.flight.checkandgo.Departures;
import com.kodilla.good.patterns.flight.checkandgo.Arrivals;

import java.util.HashMap;

public class CustomersChoice {

    public HashMap<Integer, RouteFinder> getTheSearchingType() {

        HashMap<Integer, RouteFinder> theList = new HashMap<>();
        theList.put(1, new Departures());
        theList.put(2, new Arrivals());
        theList.put(3, new FlightsBy());

        return theList;
    }
}