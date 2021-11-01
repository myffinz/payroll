package com.company;

public class Cleaner implements PaymentInterface{
    private String name;
    private int tripCount;
    private int tripRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTripCount() {
        return tripCount;
    }

    public void setTripCount(int tripCount) {
        this.tripCount = tripCount;
    }

    public int getTripRate() {
        return tripRate;
    }

    public void setTripRate(int tripRate) {
        this.tripRate = tripRate;
    }

    public Cleaner(String name, int tripCount, int tripRate) {
        this.name = name;
        this.tripCount = tripCount;
        this.tripRate = tripRate;
    }

    @Override
    public int getPayment(){
        int payment = this.tripRate * this.tripCount;
        return payment;
    }
}
