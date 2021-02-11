import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int result=divide();
        System.out.println(result);
    }
    private  static int divide(){
        int x,y;
        try{
             x=getint();
             y=getint();

        } catch(NoSuchElementException e){
            throw new ArithmeticException("No Such Exception");
        }
        System.out.println(" X is  " + x + " y is "+ y);
        try {
            return x / y;
        }catch (ArithmeticException e){
            e.printStackTrace();
            throw new ArithmeticException("Attempt to divide by zero");
        }
    }

    private static int getint(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLease Enter An Integer");
        while(true){
            try{
                return scanner.nextInt();

            } catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Please enter only digits not any other thing");
            }
        }

    }
}
