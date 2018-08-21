package com.kodilla.good.patterns.challenges;

public class RentalExamples {
    public RentRequest examples(){
        User user = new User("Grzegorz","Tata", "grztata");
        Vehicles vehicles = new Vehicles("Car","Toyota", 1990);
        return new RentRequest(user, vehicles);
    }
}
