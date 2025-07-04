// Method Overloading...!

package com.practice.java.Polymorphism;

public class PolymorphismDemo {

    int a = 10;
    int b = 20;
    void sum(){
        System.out.println(a+b);
    }
    
    void sum(int x, int y){
        System.out.println(x+y);
    }

    void sum(int i, int j, int k){
        System.out.println(i+j+k);
    }

    void sum(double x, int y){
        System.out.println(x+y);
    }
    
    public static void main(String[] args) {
        PolymorphismDemo sample = new PolymorphismDemo();

        sample.sum();
        sample.sum(30, 40);
        sample.sum(10.10, 50);
        sample.sum(100, 200, 300);
    }
}