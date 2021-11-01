package com.company;

public class Electricity implements PaymentInterface{

    private int unit;
    private int electricityRate;

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getElectricityRate() {
        return electricityRate;
    }

    public void setElectricityRate(int electricityRate) {
        this.electricityRate = electricityRate;
    }

    public String getName() {
        return "Electricity";
    }

    public Electricity(int unit, int electricityRate) {
        this.unit = unit;
        this.electricityRate = electricityRate;
    }

    @Override
    public int getPayment() {
        int cost = this.unit * this.electricityRate;
        return cost;
    }
}