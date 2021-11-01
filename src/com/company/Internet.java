package com.company;

public class Internet implements PaymentInterface{

    private int numSubscription;
    private int subRate;

    @Override
    public String getName() {
        return "Internet";
    }

    public int getNumSubscription() {
        return numSubscription;
    }

    public void setNumSubscription(int numSubscription) {
        this.numSubscription = numSubscription;
    }

    public int getSubscriptionRate() {
        return subRate;
    }

    public void setSubscriptionRate(int subRate) {
        this.subRate = subRate;
    }

    public Internet(int numSubscription, int subRate) {
        this.numSubscription = numSubscription;
        this.subRate = subRate;
    }

    @Override
    public int getPayment() {
        int cost = this.numSubscription * subRate;
        return cost;
    }
    
}