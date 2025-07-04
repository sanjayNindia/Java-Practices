// Final Keyword Concepts

package com.practice.java.Overriding;

public class FinalKeyword {
    
    final int a = 100;

    void m(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();

        //f.a = 200; This value cannot be changed, since we have declare final at the initialisation.
        System.out.println(f.a);
    }

}
