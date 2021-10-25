package com.company;

public class Cleaner implements PaymentInterface{
    private int tripCount;
    private int tripRate;

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

    public Cleaner(int tripCount, int tripRate) {
        this.tripCount = tripCount;
        this.tripRate = tripRate;
    }

    @Override
    public int getPayment(){
        int payment = this.tripRate * this.tripCount;
        return payment;
    }
}
