package com.practice.java.InHeritance;

public class ClubCalc extends Calc {

    int gstCal(int amout){
        int gst = 18;
        return amout * gst / 100;
    }
    
}
