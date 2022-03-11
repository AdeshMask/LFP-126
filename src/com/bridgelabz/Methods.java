package com.bridgelabz;

public class Methods {
    public void instanceMethod(){
        System.out.println("Instance Method");

    }
    public static void staticMathod(){
        System.out.println("Static Method");

    }

    public static void main(String[] args){
        Methods sc = new Methods();
        sc.instanceMethod();
        System.out.println("Main Method");
    }
}
