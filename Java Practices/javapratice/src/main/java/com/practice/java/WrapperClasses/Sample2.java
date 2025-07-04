// This is an example for the unboxing

package com.practice.java.WrapperClasses;

public class Sample2 {
    public static void main(String[] args) {

        String intValue = "10";
        String doubleValue = "10.10";
        String booleanValue = "false";

        int iv = Integer.parseInt(intValue);
        System.out.println(iv);

        double dv = Double.parseDouble(doubleValue);
        System.out.println(dv);

        boolean bv = Boolean.parseBoolean(booleanValue);
        System.out.println(bv);
    }
}
