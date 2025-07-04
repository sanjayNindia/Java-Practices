package com;

public class Person {
    
    String name;
    int age;

    public static void main(String[] args) {
       Person details =  new Person();
       details.name = "Sanjay N";
       details.age = 28;
       System.out.println("The Name of Person: "+details.name);
       System.out.println("The Age of the Person: "+details.age);

    }

}
