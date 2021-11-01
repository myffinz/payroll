package com.company;

public class Driver implements PaymentInterface{
    private String name;
    private int dayCount;
    private int dayRate;

    public String getName(){
        return this.name;
    }

    public int getDayCount() {
        return this.dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public int getDayRate() {
        return this.dayRate;
    }

    public void setTripRate(int dayRate) {
        this.dayRate = dayRate;
    }

    public Driver(String name, int dayCount, int dayRate) {
        this.name = name;
        this.dayCount = dayCount;
        this.dayRate = dayRate;
    }
    
    @Override
    public int getPayment(){
        int payment = this.dayRate * this.dayCount;
        return payment;
    }
}
