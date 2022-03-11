package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        int n;
        double harmonicNumbe = 1.0;
        System.out.println("Enter the Number to print its Harmonic Number:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i < n; i++){
            harmonicNumbe = (double) (harmonicNumbe + (double)1 / (i+1));
            // System.out.println("  Harmmonic value of "+i+" is "+harmonicNumbe);
        }
        System.out.println("Harmonic Value of "+n+" is "+harmonicNumbe);
       // System.out.println((double)3/2);
    }
}
