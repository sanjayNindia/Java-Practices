package com;

import java.util.Scanner;

public class TestProblem {
    
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the any Numeric value: ");
        n = scan.nextInt();

        for(int i = 1; i<n;i++){
            if( n>=1  & n<=100 ){
            int j = n-i;
            System.out.println("["+i+","+j+"]");
            }  
        }
        System.out.println("The Given Value is out of range!!");
        scan.close();
    }

}
