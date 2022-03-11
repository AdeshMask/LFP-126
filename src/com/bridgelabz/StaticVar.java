package com.bridgelabz;

public class StaticVar {
    
    static int IntVar;    //static variable
    static float floatVar;//static float variable
    static int intVareiable =10; //static int variables
    
    public static void main(String[] args){
        System.out.println("Static variables :");
        float sum = IntVar + floatVar + intVareiable; //local float variable sum
        System.out.println("Addition of all float and Integer variables : "+sum);
        int sum1 = IntVar + intVareiable;  //local int variable sum1
        System.out.println("Addition of integer variables : "+sum1);

        
    }
}
