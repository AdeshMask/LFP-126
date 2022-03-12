package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Enter the Number which you want to print its Reverse*****");
        int number = sc.nextInt();
        int reverseNumber = 0;
        while(number != 0){
            int n = number % 10;
            reverseNumber = reverseNumber * 10 + n;
            number = number / 10;
        }
        System.out.println("Reverse Number : "+reverseNumber);
    }
}
