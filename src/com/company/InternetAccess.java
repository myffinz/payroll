package com.company;

public class InternetAccess implements PaymentInterface{

    private int numSubscription;
    private int subRate;

    
    public String getName() {
        return "Internet Access";
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

    public InternetAccess(int numSubscription, int subRate) {
        this.numSubscription = numSubscription;
        this.subRate = subRate;
    }

    @Override
    public int getPayment() {
        int cost = this.numSubscription * subRate;
        return cost;
    }
    
}