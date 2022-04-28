package com.bridgelabz;
import java.util.Random;

public class EmpWageBuilder {
    public final int FULL_DAY_HOUR = 8;
    public final int HALF_DAY_HOUR = 4;
    public final int IS_PART_TIME = 1;
    public final int IS_FULL_TIME = 2;
    private int noOfCompany = 0;
    private WageCalculation[] wageCalculationsOfCompanyArray;
    public EmpWageBuilder(){
        wageCalculationsOfCompanyArray = new WageCalculation[5];
    }
    private void addCompany(int wagePrHour, int workingDays, int workingHrsPrMonth, String companyName){
        wageCalculationsOfCompanyArray[noOfCompany] = new WageCalculation(wagePrHour, workingDays, workingHrsPrMonth, companyName);
        noOfCompany++;
    }
    private void computeWage(){
        for (int i=0; i<noOfCompany; i++){
            wageCalculationsOfCompanyArray[i].setTotalEmpWage(calculateCompanyWage(wageCalculationsOfCompanyArray[i]));
        }
    }
    private int calculateCompanyWage(WageCalculation wageCalculationForCompany){
        Random random = new Random();
        int startDay=0, workingHour = 0, totalWorkingHr = 0, totalWorkingDay = 0, wage=0, checkPresence;
        /* Calculate for whole month */
        while (startDay <= wageCalculationForCompany.noOfWorkingDays && totalWorkingHr<=wageCalculationForCompany.maxHrsPerMonth) {
            checkPresence = random.nextInt(3);
            /* Check Presence */
            switch (checkPresence) {
                case IS_PART_TIME:
                    workingHour = HALF_DAY_HOUR;
                    totalWorkingDay++;
                    break;
                case IS_FULL_TIME:
                    workingHour = FULL_DAY_HOUR;
                    totalWorkingDay++;
                    break;
                default:
                    workingHour = 0;
            }
            wage += workingHour * wageCalculationForCompany.empRatePrHour;
            totalWorkingHr+=workingHour;
            startDay++;
        }
        System.out.println("Total working hours for "+wageCalculationForCompany.company+" company "+totalWorkingHr+" and total working days are "+totalWorkingDay);
        System.out.println("Total wage of "+wageCalculationForCompany.company+" company is " + wage);
        return totalWorkingHr*wageCalculationForCompany.empRatePrHour;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        EmpWageBuilder empWageArray = new EmpWageBuilder();
        empWageArray.addCompany(30, 25, 120, "tcs");
        empWageArray.addCompany(25, 18, 150, "infosys");
        empWageArray.computeWage();
//        tcs.calculateMonthlyWage(30, 25, 120, "tcs");
//        infosys.calculateMonthlyWage(25, 18, 150, "infosys");
    }
}
