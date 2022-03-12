package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find its Factors::");
        n = scanner.nextInt();
        System.out.print("Factors :: ");

        for (int i=2;i<=n;i++){
            if (n % i==0){
                System.out.print(" "+i);
                n=n/i;
                i= 1;
            }
        }
    }
}
