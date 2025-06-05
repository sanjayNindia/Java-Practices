package com.practice.java.Interface;

public class C1 extends C2 implements I1,I2{

    public void m1(){
        System.out.println(x);
    }

    public void m2(){
        System.out.println(y);
    }
    
    public static void main(String[] args) {
        C1 object = new C1();
        object.m1();
        object.m2();
        object.m3();
    }

}
