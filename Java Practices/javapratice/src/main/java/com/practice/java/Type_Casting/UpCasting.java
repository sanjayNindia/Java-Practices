package com.practice.java.Type_Casting;

public class UpCasting {

    public static void main(String[] args) {
        int i = 10;
        long l = i; // Up Casting
        System.out.println(l); 

        int i1 = 20;
        float f = i1; // Up Casting
        System.out.println(f); 

        double d = 10.51;
        int i2 = (int)d; // Down Casting
        System.out.println(i2); 

        double d1 = 119129.3113; 
        float f1 = (float)d1; // Down Casting
        System.out.println(f1);

    }
}
