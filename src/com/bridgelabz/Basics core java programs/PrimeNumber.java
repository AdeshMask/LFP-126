package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    int count;
    public static void main(String[] args){
        PrimeNumber primeNumber = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check number is Prime or not");
        int number = sc.nextInt();
        for (int i = 1;i <= number;i++){
            if (number % i == 0){
                primeNumber.count = primeNumber.count +1;
            }
        }
        if (primeNumber.count == 2)
        System.out.println(number+" Is a prime number");
        else
            System.out.println(number+ " is not a Prime Number");
    }
}
