import java.util.Scanner;

public class ConvertKMtoMiles {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the data in KM:- ");
        float kilometers = scanner.nextFloat();
        float miles= kilometers* 0.621371F;
        System.out.println("The Result of  the Kilometers to miles is:- " + miles);
    }
}
