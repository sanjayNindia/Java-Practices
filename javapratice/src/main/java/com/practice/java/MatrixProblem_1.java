package com.practice.java;

public class MatrixProblem_1 {  

    int a[][] = {{2,3,4},{5,6,7},{8,9,10}};
    public static void main(String[] args) {
       MatrixProblem_1 driver = new MatrixProblem_1();
       driver.solution_1(0);
       driver.solution_2(0);
    }
    
    //To add first coloumn of matrix
    public void solution_1(int k){
        for(int i = 0;i<a.length;i++){
            for(int j = 0; j<=i-i;j++){
                k = k + a[i][j];
            }
        }System.out.println("he Sum of Matrix for 1st Solution is: "+k);
    }

    //To add 2nd coloumn of matrix
    public void solution_2(int k){
        for(int i = 0;i<a.length;i++){
            for(int j = 1 ;j<i+1;j++){
                k = k + a[i][j];
            }
        }System.out.println("The Sum of Matrix for 2nd Solution is: "+k);
    }
}
