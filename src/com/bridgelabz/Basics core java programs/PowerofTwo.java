package com.bridgelabz;

import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args){
        int n;
        int power = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power of Two :");
        n = sc.nextInt();
        int i = 1;
        while (i <= n){
            if (0 <= n && n < 31)
                power = 2 * power;
                System.out.println(power);
                i++;
        }
    }
}
