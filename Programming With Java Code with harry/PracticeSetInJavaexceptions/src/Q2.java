import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the first number which you want:- ");
            int number1= sc.nextInt();
            System.out.println("Enter the second number which you want:- ");
            int number2= sc.nextInt();
            System.out.println("The division of the two number  " + number1 + " and "+number2 +" is:- " + number1/number2) ;

        }catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }catch (ArithmeticException e){
            System.out.println("HaHa");
        }
    }
}
