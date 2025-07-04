package com.practice;

public class ArrayPractices {
    public static void main(String[] args) {
        
        //Declaring an array
        int a[] = new int[5];
       
        //Initialising an array
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

        // Another way to Declaring & Initialising  an array
        int b[] = {6,7,8,9,10};

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
        System.out.println();


    }
}
