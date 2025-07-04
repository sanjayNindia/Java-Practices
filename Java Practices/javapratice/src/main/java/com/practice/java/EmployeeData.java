package com.practice.java;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeData {

    String empName;
    String empSalary;
    String empDesignation;

    public static void main(String[] args) {

        EmployeeData emp = new EmployeeData();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee Name, Designation, And Salary");
        emp.empName = scan.nextLine();
        emp.empDesignation = scan.nextLine();
        emp.empSalary = scan.nextLine();

        ArrayList<String> employeeDetails = new ArrayList<>();

        employeeDetails.add(emp.empName);
        employeeDetails.add(emp.empDesignation);
        employeeDetails.add(emp.empSalary);

        for(int i = 0;i<employeeDetails.size();i++){
            System.out.println(employeeDetails.get(i));
        } 
        scan.close();
    }
}
