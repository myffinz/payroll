package com.company;

public class Rental implements PaymentInterface{

    private int monthlyRent;
    private int rentalRate;

    @Override
    public String getName() {
        return "Rental";
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Rental(int monthlyRent, int rentalRate) {
        this.monthlyRent = monthlyRent;
        this.rentalRate = rentalRate;
    }

    @Override
    public int getPayment() {
        int payment = this.monthlyRent * this.rentalRate;
        return payment;
    }
}