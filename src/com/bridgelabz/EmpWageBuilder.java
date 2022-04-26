package com.bridgelabz;
import java.util.Random;

class WageCalculation{
    Random random = new Random();
    public final int WAGE_PR_HOUR = 20;
    public final int FULL_DAY_HOUR = 8;
    public final int HALF_DAY_HOUR = 4;
    public final int WORKING_DAY_PR_MONTH = 20;
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;
    int startDay = 1;
    int workingHour=0, wage=0, checkPresence, totalWorkingHr=0;
    public void calculateMonthlyWage(){
        /* Calculate for whole month */
        while (startDay <= WORKING_DAY_PR_MONTH && totalWorkingHr<=100) {
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
            totalWorkingHr+=workingHour;
            startDay++;
        }
        System.out.println("Working hours: "+totalWorkingHr);
        System.out.println("Monthly wage is " + wage);
    }
}
public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        WageCalculation wc = new WageCalculation();
        wc.calculateMonthlyWage();
    }
}
