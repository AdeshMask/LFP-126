package com.bridgelabz;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Alphabet {
        static char ch;
    public static void main(String[] args){
        System.out.println("Checking the Entered Alphabet is Vowel or Consonant");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            System.out.println("Vowel");
        }
        else
            System.out.println("Consonant");
    }
}
