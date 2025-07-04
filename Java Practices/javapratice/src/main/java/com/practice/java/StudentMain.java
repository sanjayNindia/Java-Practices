package com.practice.java;

public class StudentMain {
    
    public static void main(String[] args) {
        
        // 1. Using object referance varibles we can initilise the values to the variable.
        // student.studentName = "Sanjay N";
        // student.studentAge = 28;
        // student.studentGender = 'M';

        // student.studentDetails();

        // // 2. Using methods also we can initilise the values to the variable.
        // student.studentData("Kiran T N", 27, 'M');
        // student.studentDetails();

        // 3. Using constructos also we can initilise the values to the variable.
            Student student = new Student("Manoj ST", 27, 'M');
            student.studentDetails();
    }
}
