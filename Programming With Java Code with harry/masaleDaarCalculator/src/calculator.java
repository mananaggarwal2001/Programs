import java.util.InputMismatchException;
import java.util.Scanner;

class CannotDivideBy0Exception extends Exception{
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



public class calculator {
public static Scanner sc = new Scanner(System.in);
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
