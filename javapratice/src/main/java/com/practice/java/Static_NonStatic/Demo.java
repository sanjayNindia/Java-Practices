package com.practice.java.Static_NonStatic;

public class Demo {
    
    int add(int a, int b){
        return a+b;
    }
}
 class InnerDemo {
    Demo obj = new Demo();

    int printAdd(){
        int sum = obj.add(10, 20);
        return sum;
    }
   public static void main(String[] args) {
    
    InnerDemo obj = new InnerDemo();
    int ans = obj.printAdd();
    System.out.println(ans);
    }
}