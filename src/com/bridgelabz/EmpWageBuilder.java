package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

//      Generate random number to check emp presence
        Random random = new Random();
        int isPresent = random.nextInt(2);

//      Check Presence
        if (isPresent == 1)
            System.out.println("Employee is present.");
        else
            System.out.println("Employee is absent.");
    }
}
