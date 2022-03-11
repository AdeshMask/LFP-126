package com.bridgelabz;

public class AlltypesofVariables {
    public int intvar;     //Instance variable
    static int statInt;    //Static variable

    public static int m1(){
        System.out.println("Value of static variable :" +statInt);
        int y = 20;     //Local variable
        return y;      //returning the value


    }
    public static void main(String[] args){
        System.out.println("All types of variables :");
        AlltypesofVariables alltypesofVariables = new AlltypesofVariables();     //class object created
        System.out.println("value of Instancce variable : "+alltypesofVariables.intvar);
        int c = alltypesofVariables.m1();    //Storing the returned value into the local variable
        System.out.println("value of return type c is : "+c);
        int a = 10;    //Local vriable
        System.out.println("value of local variable :"+a);
    }
}
