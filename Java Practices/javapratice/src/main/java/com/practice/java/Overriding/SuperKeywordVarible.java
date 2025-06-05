package com.practice.java.Overriding;

public class SuperKeywordVarible {

    int a = 100;
    SuperKeywordVarible(){
        System.out.println("This is a parent constructor");
    }
    void display(){
        System.out.println("This is the parent Method");
    }
}

class Second extends SuperKeywordVarible{

    int a;
    
    Second(int x){
        super();
        a = x;
    }
    void display(){
        super.display();
        System.out.println(super.a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Second s = new Second(10);
        s.display();
    }
}