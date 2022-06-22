import java.util.Scanner;

public class PracticeSet {
static int sum=0;
static int loopNumber=0;
static int trackingVariable=0;
static int no_of_Lines=0;
static int sum_of_N_Numbers(int range){
    // base condition no 1:
    if(range ==1){
        return 0;
    }
    sum= range +sum_of_N_Numbers(range-1);
    return sum;
}

static int fabonacci_series(int number){
    if(number==1 || number==0 ){
        return number;
    }else{
        return (number+fabonacci_series(number-1));
    }
}

static int average(int ...arr){
    int sum=0;
    for(int element : arr){
        sum+=element;
    }
    int average= sum/arr.length;
    return average;
}

static void decreamenting_Pattern(int number){
    // base condition No 1:-
    if(number==-1){
        return;
    } // base conditon no 1;

    if(loopNumber!=0) {
        System.out.print("*");
        loopNumber--;
    }else{
        loopNumber=number;
        System.out.println(" ");
        number--;
    }
    decreamenting_Pattern(number);

}
static void increamenting_pattern(int number){
    // base condition No 1:-
    if(number==0){
        return;
    }
    for (int i=0;i<=loopNumber;i++){
        System.out.print("*");
    }
    System.out.println("");
    loopNumber++;

    increamenting_pattern(number-1);

}
    public static void main(String[] args) {
        // Problem No 1:- Write a Java method to print the multiplication table of a number n.
//        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(n+ " X " +i +" = "+ n*i);
//        }

        // Problem No 2:- Write a program using functions to print the following pattern:

//        int n=4;
//        for (int i=1;i <= n ;i++){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // Problem No 3:- Write a recursive function to calculate the sum of first n natural numbers.
//        int result= sum_of_N_Numbers(12);
//        System.out.println("the result of the given number is :- "+ result);

        // Problem No 4:- Wrtie  the following funciton to print the Following Pattern
//        for (int i=4;i>=0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // Problem No 5:- Write a function to print the nth term of the Fibonacci series using recursion.
//        int i= 10;
//        System.out.println(fabonacci_series(10)); // last result of the fabonacci series in  returned in the calling statement.

// Problem 6:- Write a function to find the average of a set of numbers passed as arguments.
//        System.out.println("The Average of the given Numbers is :- "+ average(1,1,1,1,1));
// Problem 7:- Repeat Problem 4 using the recursion.
//    decreamenting_Pattern(10);

    // Problem 8:- Repeat Problem 2 Using the recursion
//    increamenting_pattern(10);

    }
}
