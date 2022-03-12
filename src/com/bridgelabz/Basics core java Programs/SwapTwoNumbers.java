package com.bridgelabz;

public class SwapTwoNumbers {
    static int firstNumbe = 13;
    static int secondNumber = 30;

    public static void swap(){
        int temp = firstNumbe;
        firstNumbe = secondNumber;
        secondNumber = temp;
        System.out.println("After Swapping two numbers :");
        System.out.println("first Number : "+firstNumbe);
        System.out.println("Second Number : "+secondNumber);
    }

    public static void main(String[] args){
        System.out.println("Before swaping Two Numbers :");
        System.out.println("First Number :" +firstNumbe);
        System.out.println("Second Number : " +secondNumber);
        swap();
    }
}
