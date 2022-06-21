import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeSetOnLoop {
    public static void main(String[] args) {
        // Quesion No 1:
//        for(int i=4;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Qustion No 2:
        // Sum of the First N natural Number using the while loop.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number for which you want the sum:- ");
//        int n= sc.nextInt();
//        int sum=0;
//        while(n>0){
//            sum+=2*n;
//            n--;
//        }
//        System.out.println("The sum of the given natural number is :- " + sum);

        // Question No 3:
        // Print the multiplication of the table of the given number n
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the number for which you want the table :-");
//        int n= sc.nextInt();
//        for (int i=1 ;i<=10;i++){
//            System.out.println(n+" * "+i+" = "+n*i);
//        }

        // Question No 4:
        // Print the multiplication of the n number in the reverse order.
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the number for which you want the table:- ");
//        int n= sc.nextInt();
//        for (int i=10;i>0;i--){
//            System.out.println(n+" * "+i+" = "+n*i);
//        }

        // Question No 5:
        // Print the Factorial of the number
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the number for which you want the factorial :- ");
//        int n= sc.nextInt();
//        int sum=1;
//        for (int i=n ; i>0;i--){
//            sum*=i;
//        }
//        System.out.println("The Factorial of the given Number "+n+" is :- "+ sum);

        // Question No 6 : Using the while loop find the factorial of  the number :-
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the number for which you want the factorial :- ");
//        int n= sc.nextInt();
//        int storedNumber= n;
//        int sum=1;
//        while(n>0){
//            sum*=n;
//            n--;
//        }
//        System.out.println("The Factorial of the given Number "+storedNumber+" is :- "+ sum);

        // Question No 7: Repeat the problem number 1 using the while loop
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the No of rows for which you want the pattern :- ");
//        int no_of_rows= sc.nextInt();
//        int no_of_coloumn=0;
//        while(no_of_rows!=-1){
//            if(no_of_coloumn!=0){
//                System.out.print("*");
//                no_of_coloumn--;
//                continue;
//            }
//            System.out.println();
//            no_of_coloumn= no_of_rows;
//            no_of_rows--;
//
//        }

        // Question No 9 :- Program to sum the number using the occuring in the multiplication table of 8.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the numbers for which you want the sum:- ");
        int number = sc.nextInt();
        int sum=0;
        for (int i=1 ; i<= number;i++){

                sum+=(8*i);

        }
        System.out.println("The sum of the numbers which is coming in the multiple of 8 is:- " + sum);

    }
}
