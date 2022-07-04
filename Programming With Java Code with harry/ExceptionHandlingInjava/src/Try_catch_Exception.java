import java.util.Scanner;

public class Try_catch_Exception {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        Scanner scanner = new Scanner(System.in);
        int index;
        while (true) {
            try {
                System.out.print("Enter the value of the index:- ");
                index = scanner.nextInt();
                System.out.println("The value at the Given Index is :- " + arr[index]);
                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry This Index Does not exist !!!!!!!!!");
                System.out.println("Please Try Again !!!!!!!!!!!!!!!!!!!");
            }
        }

        System.out.println("Thanks for using this Program !!!!!!!!!!!!!!!!!!");

    }
}
