// This is a practice problem using for loop concepts: To Print a table of given number.

package com.practice.java;

import java.util.Scanner;

public class Tables {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("The Value to print a tables:");
        int n = scan.nextInt();

        for(int i = 1; i <= 10; i++){

            int ans = n * i;
            System.out.println(n+" x "+i+" = "+ans);
        }
        scan.close();

    }

}
