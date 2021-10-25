package com.company;

public class Driver {
    private int dayCount;
    private int dayRate;

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public int getDayRate() {
        return dayRate;
    }

    public void setTripRate(int dayRate) {
        this.dayRate = dayRate;
    }

    public Driver(int dayCount, int dayRate) {
        this.dayCount = dayCount;
        this.dayRate = dayRate;
    }
    
    @Override
    public int getPayment(){
        int payment = this.dayRate * this.dayCount;
        return payment;
    }
}
