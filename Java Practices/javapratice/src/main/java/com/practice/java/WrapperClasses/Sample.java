// This is the example for the autoboxing

package com.practice.java.WrapperClasses;

public class Sample {
    public static void main(String[] args) {
        
        char c = 'A';
        int i = 10;
        double d = 10.10;
        boolean b = true;

        String str = String.valueOf(c);
        System.out.println(str);

        str = String.valueOf(i);
        System.out.println(str);

        str = String.valueOf(d);
        System.out.println(str);

        str = String.valueOf(b);
        System.out.println(str);

    }

}
