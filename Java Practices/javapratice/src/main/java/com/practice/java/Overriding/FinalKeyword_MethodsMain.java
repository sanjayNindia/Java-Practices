// Final Keyword Concepts

package com.practice.java.Overriding;

final public class FinalKeyword_MethodsMain {
    int a = 100;

    void cal(){
        System.out.println(a+a);
    }
}

// We cannot extend "FinalKeyword_MethodsMain", since the class is declared with the final keyword.

// class Sample extends FinalKeyword_MethodsMain{
//     void cal(){
//         System.out.println(a-a);
//     }
//     public static void main(String[] args) {
//         Sample s = new Sample();
//         s.cal();
//     }
// }
