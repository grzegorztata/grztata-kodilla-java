package com.kodilla.good.patterns.flight;

public class RequestInformation {

    private int userChoice;
    private String cityFrom;
    private String cityTo;

    public RequestInformation(int userChoice, String cityFrom, String cityTo) {
        this.userChoice = userChoice;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public int getUserChoice() {
        return userChoice;
    }
}
