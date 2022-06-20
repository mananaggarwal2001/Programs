import java.time.Year;
import java.util.Scanner;
public class Conditional_in_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leap Year

        System.out.print("Enter the Year:- ");
        int year= scanner.nextInt();


        if (year %4==0){
            if (year%100==0){
                if(year%400==0){
                    System.out.println("The given year is the leap year");
                }else{
                    System.out.println("The given year is not the leap year");
                }
            }else{
                System.out.println("The given Year is the leap year");
            }
        }else{
            System.out.println("The given year is not the leap year");
        }


    }
}
