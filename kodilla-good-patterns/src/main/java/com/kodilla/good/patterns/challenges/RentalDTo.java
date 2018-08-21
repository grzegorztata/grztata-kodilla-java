package com.kodilla.good.patterns.challenges;

public class RentalDTo {

    private User user;
    private boolean isOrder;

    public RentalDTo(User user, boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrder() {
        return isOrder;
    }

    @Override
    public String toString() {
        return "RentalDTo{" +
                "user=" + user +
                ", isOrder=" + isOrder +
                '}';
    }
}
