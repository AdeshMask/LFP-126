package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    static int  Number;

    public static void check(int x){
        if(x == 0){
            System.out.println("The Entered Number is Even Number");
        }
        else
            System.out.println("The Entered Number is Odd Number");
    }

    public static void main(String[] args){
        System.out.println("Enter the Number to check even or Odd");
        Scanner sc = new Scanner(System.in);
        Number = sc.nextInt();
        int rem = Number % 2;
        check(rem);
    }
}
