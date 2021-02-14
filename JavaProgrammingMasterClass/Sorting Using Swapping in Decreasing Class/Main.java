package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array=getarray(5);
        printarray(array);
        sortarray(array);

    }
    public static int[] getarray(int number){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the " + number + " elements" );
        int[] value=new int[number];
        for(int i=0;i<value.length;i++){
            value[i]=scanner.nextInt();
        }
        return value;
    }
    public static void printarray(int[]array){
    for(int i=0;i<array.length;i++){
        System.out.println(" The Element Was " + i + " and the number was "+ array[i]);
    }
    }
    public static void sortarray(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("The sorted array in decending order is ");
        printarray(array);
    }

}
