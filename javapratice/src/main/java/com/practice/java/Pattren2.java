// Problem to practice the Nested Loop: To print the pattren like below:
// 1 
// 2 3
// 4 5 6
// 7 8 9 10 as pyramid1

// 1 
// 2 3
// 4 5 6
// 7 8 9 10 as pyramid2

package com.practice.java;

public class Pattren2 {
    
    public static void main(String[] args) {
        Pattren2 fn = new Pattren2();
        fn.pyramid1();
        System.out.println("---------------");
        fn.pyramid2();
    }   
    
    public void pyramid1(){
        System.out.println("");
        int k = 1;
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k+" ");
                    k++;
                }System.out.println();
            }
    }
    public void pyramid2(){
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }System.out.println();
            }
    }
}

 