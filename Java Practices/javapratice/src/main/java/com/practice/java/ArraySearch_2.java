// To find duplicate elements in an Array


package com.practice.java;

public class ArraySearch_2 {
    
    public static void main(String[] args) {
        
        int a[] = {20, 49, 93, 32, 20, 30, 54};
        int temp = 20;
        int k = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == temp){
                k++;
            }
        }
        System.out.println(k+" Times the value "+temp+" is repeated in an array");
    }
}
