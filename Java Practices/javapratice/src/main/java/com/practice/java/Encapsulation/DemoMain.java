package com.practice.java.Encapsulation;

public class DemoMain {

    public static void main(String[] args) {
        DemoPojo empDetials = new DemoPojo();

        empDetials.setEmpName("Sanjay N");
        System.out.println("Employee Name: "+empDetials.getEmpName());

        empDetials.setEmpId(12);
        System.out.println("Employee Id: "+empDetials.getEmpId());

        empDetials.setEmpSalary(1920000.50);
        System.out.println("Employee Salary: "+empDetials.getEmpSalary());
    }
    
}