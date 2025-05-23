// Example on Main Method Overloading;

package com.practice.java.Polymorphism;

public class DemoMMO {

    String main(String Name){
        return Name;
    }

    void main(int age, char gender){
        System.out.println("Student Age: "+age);
        System.out.println("Student Gender: "+gender);
    }

    void main(double height, int weight){
        System.out.println("Student Height: "+height+" ft");
        System.out.println("Student Weight: "+weight+" Kgs");
    }
    public static void main(String[] args) {
        
        DemoMMO oml = new DemoMMO();

        System.out.println("Student Name: "+oml.main("Sanjay N"));
        oml.main(28,'M');
        oml.main(5.8, 108);
        
    }
    
}