package com.practice.java;

public class MethodMain {

    public static void main(String[] args) {
        
        Methods sample = new Methods();

        sample.m1();
        String data = sample.m2();
        System.out.println(data);
        sample.m3("Sanjay");
        String data2 = sample.m4("Think like a gangstar, and Speak like a Gangstar");
        System.out.println(data2);
    }
}