package com.practice.java;

public class RevArray {
    public static void main(String[] args) {
        int arr[] = {2,5,9,23,6,18};

        for(int i = arr.length-1;i<arr.length;i--){
            if(i<0){
                break;
            }
            System.out.print(arr[i]);
        }

    }
    
}
