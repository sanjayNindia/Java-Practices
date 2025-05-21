package com.practice.java;

public class ConstructorDemo {
    
    int a, b;

    ConstructorDemo(){ // Default Constructors - No Aurgument Constructor
        a = 100;
        b = 200;
    }

    ConstructorDemo(int x, int y){
        a = x;
        b = y;
    }

    void sumOfTwoNumbers(){
        int sum = a+b;
        System.out.println("The Sum of Two Number is: "+sum);
    }
    public static void main(String[] args) {
        ConstructorDemo sample  = new ConstructorDemo(); // Example for the Default constructor
        System.out.println("Example for the Default constructor\n-----------------------------------");
        sample.sumOfTwoNumbers();

        System.out.println();

        ConstructorDemo sample1 = new ConstructorDemo(10,20); // Example for the Parameterised constructor
        System.out.println("Example for the Parameterised constructor\n-----------------------------------------");
        sample1.sumOfTwoNumbers();
        
    }
}

