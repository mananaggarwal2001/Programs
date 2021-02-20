package com.Series;

public class Fibonacci {
    private static int num1=1;
    private static int sum;

    public static int fibonacci(int number){
        sum+=num1;

        int temp;
        temp=sum;
        sum=num1;
        num1=temp;

        return sum;
    }
}
