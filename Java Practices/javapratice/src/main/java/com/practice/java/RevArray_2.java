package com.practice.java;


import java.util.Arrays;

public class RevArray_2 {
    public static void main(String[] args) {
        int arr[] = {2,8,10,43,4,9,3};
        System.out.println(Arrays.toString(arr));

        int arrLen = arr.length;
        int rev[] = new int[arrLen];
        for(int i = 0;i<arr.length;i++){
            rev[i] = arr[arrLen-1];
            arrLen--;
        }
        System.out.println(Arrays.toString(rev));
    }
}
