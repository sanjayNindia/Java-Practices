package com.practice.java;

public class LinearSearch {

    public static void main(String[] args) {
        
        int a[] = {100, 200, 300, 400, 500, 600};
        int n = 5100;
        boolean status = false;
        for(int i = 0;i<a.length;i++){
            if(n == a[i]){
                System.out.println("The key element is found and it is in the "+i+"th Place in an array");
                status = true;
                break;
            } 
        }
        if (status == false) {
            System.out.println("The key element is not found in an array!");
        } 
    } 
}
