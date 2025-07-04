// This program will define the example of the different types of Methods
 
package com.practice.java;

public class Methods {
    
    //1. Method which has no parameters and no return type
    void m1(){
        System.out.println("Hello..!");
    }

    //2. Method which has no parameters and having return type.
    String m2(){
        return ("Welcome to the world");
    }

    //3. Method which has parameters and no return type.
    void m3(String name){
        System.out.println("Welcome to world "+name);
    }

    //4. Method which has parameters and return type.
    String m4(String quote){
        return ("Today's Quote is "+quote);
    }
    
}
