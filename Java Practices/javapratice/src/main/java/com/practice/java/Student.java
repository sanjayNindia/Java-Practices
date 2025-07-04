// Pojo class for the - Approches to initialise th varibles.
package com.practice.java;

public class Student {
    String studentName;
    int studentAge;
    char studentGender;

    void studentDetails(){
        System.out.println(studentName+"    "+studentAge+"    "+studentGender);
    }

    void studentData(String name, int age, char gender){
        studentName = name;
        studentAge = age;
        studentGender = gender;
    }

    Student(String name, int age, char gender){
        studentName = name;
        studentAge = age;
        studentGender = gender;
    }
}
