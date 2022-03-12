package com.bridgelabz;

public class QuotientandRemminder {
    static int divident = 500;
    static int divisor = 45;
    static int quotient;
    public int reminder;
    public static int division(){
        quotient = divident / divisor;
        System.out.println("Quotient : " +quotient);
        return quotient;
    }

    public static void main(String[] args){
        QuotientandRemminder quotientandRemminder = new QuotientandRemminder();
        division();
        quotientandRemminder.reminder = divident - (quotient  * divisor);
        System.out.println("Reminder :"+quotientandRemminder.reminder);
    }

}
