package com.practice.java;

import java.util.Scanner;

public class CompareTwoNumber {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of 'n':");
        int n = scan.nextInt();

        if(n%2!=0){
            System.out.println("Weird");
        } else if (n>=2 && n<=5) {
            System.out.println("Not Weird");            
        } else if (n>=6 && n<=20){
            System.out.println("Weird");
        } else if (n>20) {
            System.out.println("Not Weird");
        }
        scan.close();
    }
}
