package com.kodilla.good.patterns.challenges;

public class Vehicles {

    private String vehicleType;
    private String vehicleBrand;
    private int vehicleYear;

    public Vehicles(String vehicleType, String vehicleBrand, int vehicleYear) {
        this.vehicleType = vehicleType;
        this.vehicleBrand = vehicleBrand;
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleYear=" + vehicleYear +
                '}';
    }
}
