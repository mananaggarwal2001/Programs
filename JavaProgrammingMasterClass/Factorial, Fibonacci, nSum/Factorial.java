package com.Series;

public class Factorial {
    private static int facnumber;
    public static long factorial(long number){
        facnumber=1;
        for(long i=number;i>1;i--){

            facnumber*=i;
        }
        return facnumber;
    }
}
