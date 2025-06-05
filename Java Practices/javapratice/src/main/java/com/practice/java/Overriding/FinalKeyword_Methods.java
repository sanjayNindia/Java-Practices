package com.practice.java.Overriding;

public class FinalKeyword_Methods {
    
    final void method_1(){
        System.out.println("This is the method_1");
    }
}

class FinalKeyword_Methods_2 extends FinalKeyword_Methods{
    // we cannot override the methods, since the method is declared with a final Keyword.

    // void method_1(){
    //     System.out.println("This Method Overrides method_1");
    // }
    public static void main(String[] args) {
        FinalKeyword_Methods_2 fm = new FinalKeyword_Methods_2();
        fm.method_1();
    }
}