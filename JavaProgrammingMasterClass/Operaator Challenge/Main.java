package com.company;

public class Main {

    public static void main(String[] args) {
        double myvalue1=20.00;
        double myvalue2= 80.00;
        double myvalue3=(myvalue1+myvalue2) *100 ;//100*100=10000
        System.out.println("My value 3 is"+ myvalue3);
        double remainder=myvalue3%40.00;
        System.out.println("the remainder is :-" + remainder);
        boolean result=(remainder==0)? true:false;
        System.out.println("the result is "+ result);
        if(result!=true)
        {
            System.out.println("Got some remainder");
            

        }

    }
}
