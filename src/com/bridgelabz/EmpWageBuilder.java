package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {
    public static final int WAGE_PR_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int HALF_DAY_HOUR = 4;
    public static final int WORKING_DAY_PR_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        /* Generate random no. to check emp presence */
        Random random = new Random();
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        int startDay = 1;
        int workingHour=0, wage=0, checkPresence;

        /* Calculate for whole month */
        while (startDay <= WORKING_DAY_PR_MONTH) {
            checkPresence = random.nextInt(3);
            /* Check Presence */
            switch (checkPresence) {
                case IS_PART_TIME:
                    workingHour = HALF_DAY_HOUR;
                    break;
                case IS_FULL_TIME:
                    workingHour = FULL_DAY_HOUR;
                    break;
                default:
                    workingHour = 0;
            }

            wage += workingHour * WAGE_PR_HOUR;
            startDay++;
        }
        System.out.println("Monthly wage is " + wage);
    }
}
