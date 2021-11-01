package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Developer dev1 = new Developer("Korn", 40000, 10, 500, 12, 1000);
        Ceo ceo1 = new Ceo("Bill", 100000, 2, 500, 5, 10000);
        Marketing marketing1 = new Marketing("Sara", 25000, 12, 500, 2, 1000);
        Driver driver1 = new Driver("John", 6, 800);
        Cleaner cleaner1 = new Cleaner("Boon", 15, 350);
        Rental rent1 = new Rental (30,15000);
        Electricity elec1 = new Electricity(20,20000);
        Internet internet1 = new Internet(30,20000);

        int totalPayment = 0;

        ArrayList<PaymentInterface> cost = new ArrayList<PaymentInterface>();
        cost.add(dev1);
        cost.add(ceo1);
        cost.add(marketing1);
        cost.add(driver1);
        cost.add(cleaner1);
        cost.add(rent1);
        cost.add(elec1);
        cost.add(internet1);
        for (PaymentInterface payments : cost) {
            int payment = payments.getPayment();
            System.out.println(payments.getName() + " Payment: " + payment);
            totalPayment += payment;
        }
        System.out.println("Total Payment: " + totalPayment);
    }
}
