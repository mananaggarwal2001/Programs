package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;



class CannotDivideBy0Exception extends Exception{

    /**
     * This is the cannot Divide By Exception Error And this is Self Made Exception
     * @return nothing.
     */
    @Override
    public String toString() {
        return "The Divisor number which you have supplied is not applicable for doing the division Operation Please try again!!!!!!!!!!";
    }

    @Override
    public String getMessage() {
        return "The Divisor number which you have supplied is not applicable for doing the division Operation Please try again!!!!!!!!!!!";
    }
}
class MaxInputException extends Exception{
/**
 * This is the Exception Class Etc.
 * */
    @Override
    public String toString() {
        return "Number not allowed greater than 100000 please Try again !!!!!!!!!!!!!!";
    }

    @Override
    public String getMessage() {
        return "Number not allowed greater than 100000 please Try again !!!!!!!!!!!!!!";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "Input greater than 7000 is not allowed For the multiplication";
    }

    @Override
    public String getMessage() {
        return  "Input greater than 7000 is not allowed For the multiplication";
    }
}
/**
 * This is the special calculator which is used for calculating the certain things.
 * @author Manan Aggarwal
 * @since 1991
 * Rocky Bhai
 */


public class calculator {
public static Scanner sc = new Scanner(System.in);

    /**
     * This is the Addition class Which is used For Performing the addition Task etc.
     * And From my source File you can used this Special calculator for performing the certain task.
     * This is the method and this is the most beautiful method used by the all the users for performing the addition Program etc.
     * @deprecated Sadly we can say that is the depricated method for performing the addition and please wait until the modified method will come and use the custom made method.
     * @throws MaxInputException This method throws the MaxInputException Error when the user is suppling the value which is greater than the value of the 100000. It will thrown this exception.
     */
    static void Addition() throws MaxInputException{
        int number1,number2;
        try{
            System.out.print("Enter the number 1 :- ");
            number1= sc.nextInt();
            System.out.print("Enter the number 2:- ");
            number2= sc.nextInt();
            if(number1>100000 || number2> 100000){
                throw new MaxInputException();
            }
            int result  = number1 + number2;
            System.out.println("The Sum of the Two numbers " + number1 + " and "+ number2 + " is " + result);
        }catch (InputMismatchException e){
            System.out.println("The input which is Provided is not applicable for the addition please try again !!!!!!!!!!!!!!!!");
        }

    }


    static void Subtraction() throws MaxInputException{
        int number1,number2;
        try{
            System.out.print("Enter the number 1:- ");
            number1= sc.nextInt();
            System.out.print("Enter the number 2:- ");
            number2= sc.nextInt();
            if(number1>100000 || number2> 100000){
                throw new MaxInputException();
            }
            int result= number1-number2;
            System.out.println("The difference of the Two numbers " + number1 + " and "+ number2 + " is " + result);
        }catch (InputMismatchException e){
            System.out.println("The input is not applicable for doing the subtraction operation Please Try again !!!!!!!!!!!!!!!!!!!");
        }
    }

    /**
     *
     * @throws MaxMultiplierReachedException
     */
    static void Multiplication() throws MaxMultiplierReachedException{
        int number1,number2;
        try{
            System.out.print("Enter the number 1:- ");
            number1 = sc.nextInt();
            System.out.print("Enter the number 2:- ");
            number2= sc.nextInt();
            if(number1>7000 || number2> 70000){
                throw new MaxMultiplierReachedException();
            }
            int result = number1 *number2;
            System.out.println("The Product of the Two numbers " + number1 + " and "+ number2 + " is " + result);
        }catch (InputMismatchException e){
            System.out.println("Not a valid input is applied for the multiplication Process !!!!!!!!!");
        }
    }

    static void Division() throws MaxInputException,CannotDivideBy0Exception{
        int number1,number2;
        try{
            System.out.print("Enter the Dividend Number:- ");
            number1= sc.nextInt();
            System.out.println("Enter the Divisior Number:- ");
            number2= sc.nextInt();
            if(number1>100000 || number2 > 100000){
                throw new MaxInputException();
            }
            if(number2==0){
                throw new CannotDivideBy0Exception();
            }
            int result= number1/number2;
            System.out.println("The division result of the Two numbers " + number1 + " and "+ number2 + " is " + result);
        }catch (InputMismatchException e){
            System.out.println("Invalid input is supplied Please try again !!!!!!!!!!!!!!!");
        }
    }

    /**
     * This is the Main Static method which uses the switch as the Purpose for executing the calculator which takes the two values and then return the result of the values which is either error or the sum of the values.
     * @param args This is the argument Class
     * @deprecated This addition method is depricated please wait for the other method to come for replacing this depricated method and used the self made depricated method etc.
     *
     */
    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");
            System.out.println(" ");
            System.out.print("Enter your choice:- ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    try {
                    Addition();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    try{
                        Subtraction();
                    } catch (MaxInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    try{
                        Division();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4: {
                    try{
                        Multiplication();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                break;
                }
                case 5: {
                    break;
                }
                default:
                    System.out.println("Wrong Choice Pls Try Again !!!!!!!!!!!!!!!!!!!");

            }
        }while (choice !=5);
    }
}
