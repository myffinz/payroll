package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Developer dev1 = new Developer("Korn", 40000, 10, 500, 12, 1000);
        Ceo ceo1 = new Ceo("Bill", 100000, 2, 500, 5, 10000);
        Staff marketing1 = new Staff("Sara", 25000, 12, 500);

        int totalPayment = 0;

        ArrayList<Staff> staffs = new ArrayList<Staff>();
        staffs.add(dev1);
        staffs.add(ceo1);
        staffs.add(marketing1);
        for (Staff staff : staffs) {
            int payment = staff.getPayment();
            System.out.println(staff.getName() + " Payment: " + payment);
            totalPayment += payment;
        }
        System.out.println("Total Payment: " + totalPayment);
    }
}
