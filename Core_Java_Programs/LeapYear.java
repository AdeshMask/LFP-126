package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        int length = 4;
        boolean leap = false;
        System.out.println("Enter Year to check is it Leap of Not");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        int yearLength = String.valueOf(year).length();
        if (length == yearLength){
            if (year % 4 == 0){
                if (year % 100 == 0)
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
