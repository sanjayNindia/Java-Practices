package com.practice.java.ExceptionHandling;

import java.util.Scanner;

public class Sample {
   
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Sample obj = new Sample();
        obj.arthematicException();
        //obj.arrayException();
        //obj.nullPointerException();
    }

    void arthematicException(){
        try{
            System.out.print("Enter a value the as per your wish: ");
            int n = scan.nextInt();
            System.out.println(100/n);
            scan.close();
        }
        catch(Exception e){
            System.out.println("Enter any number apart from 0");
        }
    }

    void arrayException(){
        try{
            int arr[] = new int[3];
            System.out.print("Enter a value the as per your wish: ");
            int n = scan.nextInt();
            arr[n] = n;
            scan.close();
        }
        catch(Exception e){
            System.out.println("Please provide the value less than 3");
        }
    }
    void nullPointerException(){
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(Exception e){
            System.out.println("Please provide the proper value");
        }
    }
}
