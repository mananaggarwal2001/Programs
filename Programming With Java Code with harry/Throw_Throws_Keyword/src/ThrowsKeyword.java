import java.util.Scanner;

class NegativeRadiusException extends Exception{ // this Exception class is the predefined Class which is used to make the Customs Exceptions.

    @Override
    public String toString() {
        return "Radius can't be nagative!!!!!!!";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative !!!!!!!!!!";
    }
}
public class ThrowsKeyword {

    public static double AreaOfCircle(double radius) throws NegativeRadiusException{
        if(radius<0){
            throw new NegativeRadiusException();
        }
        double result= Math.PI *  Math.pow(radius, 2);
        return result;
    }
    public static int numberDividebyNumber(int number1, int number2) throws ArithmeticException{
        int result = number1/number2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Dividend number :- ");
//        int number1 = sc.nextInt();
//        System.out.print("Enter the Divisor number:- ");
//        int number2 = sc.nextInt();
//
//        try{
//            int result = numberDividebyNumber(number1, number2);
//            System.out.println("The result of the division of the "+ number1 + "/"+ number2 + " is:- "+ result);
//        }catch (Exception e){
//            System.out.println("Perform division is not possible as number you have supplied is not valid number !!!!!!!!!!!!!!!!!!");
//        }
        System.out.print("Enter the radius for which you want to find the area:- ");
        double radius = sc.nextDouble();
        try{
            double result= AreaOfCircle(radius);
            System.out.println("The Area of the Circle of given radius " + radius + " is:- "+ result);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Thanka for using this Program !!!!!!!!!!!!!!");
    }
}
