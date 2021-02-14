import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.Enter the bank details");
            System.out.println("2.Enter the customer List which you want to Search");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bank.inputdetails();
                    break;
                case 2:
                    bank.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong choice!!!!!!!!!!!!!!!!!!!!");

            }
        }while(choice!=3);
    }
}
