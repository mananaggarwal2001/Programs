package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(LeapYear(1948));
    }
    public static String LeapYear(int year){
        if (year % 4 == 0) {
            return "Leap Year.";
        } else {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return ("Leap year.");
                } else {
                    return ("Not leap year.");
                }
            } else {
                return ("Not leap year.");
            }
        }
    }
}
