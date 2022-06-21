import java.util.Scanner;

public class PracticeSetOnArrays {
    public static void main(String[] args) {
// Question 1: To find the sum of the given array using the for loop
        //        float [] arr = new float[5];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i=0;i<arr.length;i++){
//            System.out.print("Enter the value Number "+ i +" :- " );
//            arr[i]=scanner.nextFloat();
//        }
//
//        float sum=0 ;
//        for (float v : arr) { // for each loop is used for the given array
//            sum += v;
//        }
//        System.out.println("The sum of the Given Array is :- " + sum);

// Question 2:- Write a program to find out whether a given integer is present in an array or not.
//        Scanner scanner = new Scanner(System.in);
//        float [] arr= new float[5];
//        int sum=0;
//        for (int i=0; i< arr.length;i++){
//            sum= i+1;
//            System.out.print("Enter the value of " + sum + " in the array:- ");
//            arr[i]= scanner.nextFloat();
//        }
//
//        System.out.print("Enter the value which you want to find in the array:- ");
//        float value= scanner.nextFloat();
//        boolean flag= false;
//        for (float element: arr){
//            if(value == element){
//                flag=true;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("The value is Present in the array");
//        }else {
//            System.out.println("The value is not present in the array.");
//        }

        // Question 3:- Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

//        Scanner scanner = new Scanner(System.in);
//        float [] arr= new float[5];
//        for (int i=0;i<arr.length;i++){
//            int sum= i+1;
//            System.out.print("Enter the value of " + sum + " in the array:- ");
//            arr[i]= scanner.nextInt();
//        }
//
//        float sum=0;
//        for (float element: arr){
//            sum+= element;
//
//        }
//        float Average= sum/5;
//
//        System.out.println("The averaage marks of the whole class is :- " + Average);


        // Question No 4:- Create a Java program to add two matrices of size 2x3

        int [][] arr1= new int[2][3];
        int [][] arr2= new int[2][3];

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                int sum= j+1;
                System.out.print("Enter the element "+ sum + " in the Array 1:- ");
                arr1[i][j]= scanner.nextInt();
            }

        }

        System.out.println("Input Value for the array 2 Starts From here ");
        System.out.println();
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                int sum= j+1;
                System.out.print("Enter the element "+ sum + " in the Array 2:- ");
                arr2[i][j]= scanner.nextInt();
            }
        }
        int [][] finalResult = new int[2][3];
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                finalResult[i][j]+=arr1[i][j] + arr2[i][j];
            }
        }for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                System.out.print(finalResult[i][j] + " ");
            }
            System.out.println();
        }


        // Question 5 Write a Java program to reverse an array.

//        int [] array= new int[5];
//        Scanner scanner= new Scanner(System.in);
//        for (int i=0;i<array.length;i++){
//            int sum= i+1;
//           System.out.print("Enter the value of " + sum + " in the array:- ");
//            array[i]= scanner.nextInt();
//        }
//
//        int [] reversedArray= new int[5];
//
//        for (int i=0;i<reversedArray.length;i++){
//            reversedArray[reversedArray.length-i-1]= array[i];
//        }
//
//        System.out.println("The reverses of the Array is :-");
//        System.out.println();
//        for (int i=0;i<reversedArray.length;i++){
//
//            System.out.println(reversedArray[i]);
//        }


        // Question 6:- Write a Java program to find the maximum element in an array.

//        int [] array= new int[5];
//        Scanner scanner= new Scanner(System.in);
//        for (int i=0;i<array.length;i++){
//            int sum= i+1;
//            System.out.print("Enter the value of " + sum + " in the array:- ");
//            array[i]= scanner.nextInt();
//        }
//
//        int maxElement=0;
//        int i=0;
//        int j=0;
//        maxElement= array[0];
//        while (i< array.length){
//            if(maxElement<array[i]){
//                maxElement=array[i];
//            }
//            i++;
//        }
//
//        System.out.println("The Maximum Element in the given array is :- "+ maxElement );

        // Q8 :- Write a Java program to find whether an array is sorted or not.
//        int [] array= new int[5];
//        Scanner scanner= new Scanner(System.in);
//        for (int i=0;i<array.length;i++){
//            int sum= i+1;
//           System.out.print("Enter the value of " + sum + " in the array:- ");
//            array[i]= scanner.nextInt();
//        }
//
//        boolean flag= false;
//
//        int i=array.length-1;
//        while(i>=1){
//            if(array[i]>array[i-1]){ // checking for the ascending order.
//                flag=true;
//            }else{
//                flag=false;
//                break;
//            }
//            i--;
//        }
//
//        if(flag){
//            System.out.println("The given array is the sorted array");
//        }else{
//            System.out.println("The given array is not the sorted Array");
//        }




    }
}
