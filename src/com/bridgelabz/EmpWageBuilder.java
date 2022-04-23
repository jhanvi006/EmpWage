package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
    public static final int WAGE_PR_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int HALF_DAY_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

//      Generate random number to check emp presence
        Random random = new Random();
        int isPartTime = 1;
        int isFullTime = 2;
        int checkPresence = random.nextInt(3);
        int workingHour, dailyWage;

//      Check Presence
        if (checkPresence == isPartTime)
            workingHour = HALF_DAY_HOUR;
        else if (checkPresence == isFullTime)
            workingHour = FULL_DAY_HOUR;
        else
            workingHour = 0;

        dailyWage = workingHour*WAGE_PR_HOUR; /* Possible outputs 0, 80, 160 */
        System.out.println("Daily wage is "+dailyWage);
    }
}
