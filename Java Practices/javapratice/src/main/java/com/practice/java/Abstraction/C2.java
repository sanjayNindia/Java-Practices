package com.practice.java.Abstraction;

public class C2 extends C1 implements I1 {

    void m1(int x){
        System.out.println(x);
    }
    public void m2(int x){
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        C2 object  = new C2();
        object.m1(1001);
        object.m2(1002);
    }
}
