package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args)
    {
        double result;
        int heads = 0;
        int tails = 0;
        int numFlips;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of to flip Coin");
        numFlips = scanner.nextInt();
        Random random = new Random();
        int i = 1;
        while(i <= numFlips)
        {
            result = random.nextInt(2);
            if(result < 0.5)
                heads++;
            else
                tails++;
            i++;
        }
        System.out.println("Number of times Head occures :"+heads);
        System.out.println("Number of times Tail Occures :"+tails);
        double percentHeads = (heads/numFlips)*100;
        System.out.println("Percentage of Heads :"+percentHeads);
        double percentTails = (tails/numFlips)*100 ;
        System.out.println("Percentage of tails :"+percentTails);
    }
}
