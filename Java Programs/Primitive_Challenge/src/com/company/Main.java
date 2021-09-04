package com.company;

public class Main {

    public static void main(String[] args) {
        byte mybyte=100;
        short myshort=50;
        int myint= 10000;
        long mylong= 50000L + 10L * (mybyte+myint+myshort);
        System.out.println("THE LONG NO IS " + mylong);

    }
}
