package com.bridgelabz;

import java.util.Scanner;


public class LargestNumber {
    static int large;

    public static void main(String[] args){
        System.out.println("Searching for the largest Number among the given numbers:");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("Enter the Numbers");
        for (int i=1; i<=n;i++){
            int temp = sc.nextInt();
            if (temp>large)
                large=temp;
        }
        System.out.println("largest Number is ::"+large);
    }
}
