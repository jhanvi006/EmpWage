package com.bridgelabz;

public class WageCalculation {
    public final int empRatePrHour;
    public final int noOfWorkingDays;
    public final int maxHrsPerMonth;
    public final String company;
    public int totalEmpWage;

    public WageCalculation(int wagePrHour, int workingDays, int workingHrsPrMonth, String companyName){
        this.empRatePrHour = wagePrHour;
        this.noOfWorkingDays = workingDays;
        this.maxHrsPerMonth = workingHrsPrMonth;
        this.company = companyName;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }
}
