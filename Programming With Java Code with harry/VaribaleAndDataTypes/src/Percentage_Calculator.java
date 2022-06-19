import java.util.Scanner;

public class Percentage_Calculator {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Getting the input of the Marks
        System.out.print("Enter the marks for the Subject 1:- ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter the marks for the Subject 2:- ");
        float number2 = scanner.nextFloat();

        System.out.print("Enter the marks for the Subject 3:- ");
        float number3 = scanner.nextFloat();

        System.out.print("Enter the marks for the Subject 4:- ");
        float number4 = scanner.nextFloat();

        System.out.print("Enter the marks for the Subject 5:- ");
        float number5 = scanner.nextFloat();

        float sum= number1+ number2+ number3 + number4+ number5;
        float percentage= (sum/5);
        System.out.println("The Percentage of the 5 Marks is :- "+ percentage);
    }
}
