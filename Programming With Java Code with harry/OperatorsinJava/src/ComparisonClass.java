import java.util.Scanner;

public class ComparisonClass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int givenNumber = 100;
        System.out.print("Enter the number :- ");
        int userNumber = scanner.nextInt();
        if (givenNumber > userNumber) {
            System.out.println("The Entered number is smaller than the given number");
        }else if(givenNumber < userNumber){
            System.out.println("The Entered Number is bigger than the Given Number");
        }else{
            System.out.println("Both number are equal");
        }
    }
}
