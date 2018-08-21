package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentRequest {

    private User user;
    private Vehicles vehicles;

    public RentRequest(User user, Vehicles vehicles) {
        this.user = user;
        this.vehicles = vehicles;
    }

    public User getUser() {
        return user;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return "RentRequest{" +
                "user=" + user +
                ", vehicles=" + vehicles +
                '}';
    }
}
