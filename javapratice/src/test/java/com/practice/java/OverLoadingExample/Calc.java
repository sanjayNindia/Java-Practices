package com.practice.java.OverLoadingExample;

public class Calc {
    
    int a;
    int b;

    void add(int x, int y){
        a = x;
        b = y;
        System.out.println("The Sum of two Numbers: "+(a+b));
    }

    void add(int x, int y, int z){
        a=x;
        b=y;
        System.out.println("The Sum of three Number: "+(a+b+z));
    }
}
