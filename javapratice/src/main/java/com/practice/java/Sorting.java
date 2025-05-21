package com.practice.java;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int a[] = {10,30,60,20,40,50,70};

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(a));
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        Arrays.sort(a);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));
    }
}
