package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        int WAGE_PR_HOUR = 20;
        int FULL_DAY_HOUR = 8;
//      Generate random number to check emp presence
        Random random = new Random();
        int isPresent = random.nextInt(2);
        int workingHour, dailyWage;
//      Check Presence
        if (isPresent == 1)
            workingHour = FULL_DAY_HOUR;
        else
            workingHour = 0;
        dailyWage = workingHour*WAGE_PR_HOUR;
        System.out.println("Daily wage is "+dailyWage);
    }
}
