// Problem to practice the Nested Loop: To print the pattren like below:
// 1 2 3 4
// 5 6 7 
// 8 9
// 10

package com.practice.java;

public class Pattren1 {
    public static void main(String[] args) {
        int k = 1;
        for(int i = 4; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }System.out.println();
        }
    }
}
