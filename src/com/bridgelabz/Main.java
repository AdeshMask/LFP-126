package com.bridgelabz;

public class Main {

    static int intVariable;   //static variable
    static int sum = 0;       //static variable
    static int diff = 0;      //static variable
    static int mul = 0;       //static variable
    static int division;      //static variable

    public static void add(int x, int y){       //local variables x and y
        sum = x + y;
        System.out.println("Addition of two nos is : "+sum);
    }
    public static void sub(int x, int y){       //local variables x and y
        diff = y - x;
        System.out.println("substraction : "+diff);
    }
    public static void product(int x, int y){        //local variables x and y
        mul = x * y;
        System.out.println("product of two nos is :" +mul);
    }
    public static void div(int x,int y){          //local variables x and y
        division = y / x;
        System.out.println("Division :"+division);
    }
    public static void main(String[] args) {       //local variable string[]srgs
	// write your code here
        int a = 10;      //local variable
        int b = 15;      //local variable
        add(a,b);
        sub(a,b);
        product(a,b);
        div(a,b);
    }
}
