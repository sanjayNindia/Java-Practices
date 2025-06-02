package com.practice.java.InHeritance;

public class CalcMain {
    public static void main(String[] args) {
        // ClubCalc gst = new ClubCalc();
        // System.out.println("The GST for the Given Amount: "+gst.gstCal(100));

        AdvCalc adcl = new AdvCalc();

        VeryAdvcalc obj = new VeryAdvcalc();

        System.out.println("The Sum of two Number: "+adcl.add(10, 20));
        System.out.println("The Differance of two Number: "+adcl.sub(20, 10));
        System.out.println("The Multiple of two Number: "+adcl.multiply(20, 10));
        System.out.println("The Division of two Number: "+adcl.div(20, 10));
    }
}
