package com.bridgelabz.EmployeeWage;

import java.util.Random;
public class EmpWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    public static void main(String[] args){
        Random  random = new Random();
        int wagePerDay = 0;
        int attendance = (int)Math.floor(Math.random()*10)%2;
        if (attendance==0) {
            System.out.println("Employee is Present..");
            wagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println(wagePerDay);
        }
        else {
            System.out.println("Employee is Abscent...");
            wagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println(wagePerDay);
        }
    }
}
