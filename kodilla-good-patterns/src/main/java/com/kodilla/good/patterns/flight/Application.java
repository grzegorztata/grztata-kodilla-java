package com.kodilla.good.patterns.flight;

import com.kodilla.good.patterns.flight.checkandgo.RouteFinder;
import com.kodilla.good.patterns.flight.customersService.CheckingFlights;
import com.kodilla.good.patterns.flight.customersService.CustomersChoice;

import java.util.HashMap;

public class Application {
    public static void main(String args[]) {

        CheckingFlights checkingFlights = new CheckingFlights();
        com.kodilla.good.patterns.flight.RequestInformation requestInformation = checkingFlights.choice();
        CustomersChoice customersChoice = new CustomersChoice();
        HashMap<Integer, RouteFinder> theList = customersChoice.getTheSearchingType();

        FlightInformationService flightInformationService = new FlightInformationService(theList.get(requestInformation.getUserChoice()));

        flightInformationService.process(requestInformation);

    }
}