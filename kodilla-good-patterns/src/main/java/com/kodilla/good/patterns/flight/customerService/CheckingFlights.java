package com.kodilla.good.patterns.flight.customersService;

import com.kodilla.good.patterns.flight.RequestInformation;

import java.util.Scanner;

public class CheckingFlights {

    Scanner scanner = new Scanner(System.in);
    private String cityFrom;
    private String cityTo;
    private int userChoice;

    public RequestInformation choice() {
        System.out.println("Choose the fligth From(1), To(2), By(3)");
        userChoice = scanner.nextInt();
        scanner.nextLine();

        if (userChoice == 1) {
            System.out.println("Choose the Departure Airport");
            cityFrom = scanner.nextLine();
        }
        else if(userChoice == 2) {
            System.out.println("Choose the Arrival Airport");
            cityFrom = scanner.nextLine();
        }
        else if (userChoice == 3) {
            System.out.println("Choose the Departure Airport");
            cityFrom = scanner.nextLine();
            System.out.println("Choose the Arrival Airport");
            cityTo = scanner.nextLine();
        } else {
            System.out.println("ERROR. Wrong choice");
        }
        scanner.close();

        return new RequestInformation(userChoice, cityFrom, cityTo);
    }
}
