package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    static int perfectNumber;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number To check of it is Perfect or not :");
        perfectNumber = sc.nextInt();
        int count = 0;
        for (int i = 1;i < perfectNumber;i++){
            if(perfectNumber % i == 0){
                count = count + i;
            }
        }
        if (count == perfectNumber){
            System.out.println(perfectNumber+ " is a Perfect Number");
        }
        else
            System.out.println(perfectNumber+ " is not a Perfect Number");
    }
}
