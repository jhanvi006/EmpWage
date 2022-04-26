package com.bridgelabz;
import java.util.Random;

class WageCalculation{
    Random random = new Random();
    public final int FULL_DAY_HOUR = 8;
    public final int HALF_DAY_HOUR = 4;
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;
    int startDay = 1;
    int workingHour=0, wage=0, checkPresence, totalWorkingHr=0;
    public void calculateMonthlyWage(int wagePrHour, int workingDays, int workingHrsPrMonth, String companyName){
        /* Calculate for whole month */
        while (startDay <= workingDays && totalWorkingHr<=workingHrsPrMonth) {
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
            wage += workingHour * wagePrHour;
            totalWorkingHr+=workingHour;
            startDay++;
        }
        System.out.println("Total working hours for "+companyName+" company: "+totalWorkingHr);
        System.out.println("Monthly wage of employee at "+companyName+" company is " + wage);
    }
}
public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        WageCalculation tcs = new WageCalculation();
        WageCalculation infosys = new WageCalculation();
        tcs.calculateMonthlyWage(30, 25, 120, "tcs");
        infosys.calculateMonthlyWage(25, 18, 150, "infosys");
    }
}
