package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array=readintegers(5);
        int Minimunvalue=findMin(array);
        System.out.println(" The minimum Value was " + Minimunvalue);

    }
    public static int[] readintegers(int numbers){
        int[] array=new int[numbers];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the " + numbers + " Elements ");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array[0];
    }

}
