package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String args[]) {

        RentalExamples rentalExamples = new RentalExamples();
        RentRequest rentRequest = rentalExamples.examples();

        RentalProcessor rentalProcessor = new RentalProcessor(new EmailService(), new CarService(), new RentalVehicleRepository());
        rentalProcessor.process(rentRequest);
    }
}
