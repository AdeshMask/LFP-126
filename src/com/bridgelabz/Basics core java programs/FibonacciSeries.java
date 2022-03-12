package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    static int fibonacci;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++){
            fibonacci = fibonacci + i;
            System.out.print(" "+fibonacci);
        }
    }
}
