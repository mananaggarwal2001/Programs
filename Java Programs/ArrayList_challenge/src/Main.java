import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Print list of contacts");
            System.out.println("2.Add New Contacts");
            System.out.println("3.Update Existing Contacts");
            System.out.println("4.Remove contacts");
            System.out.println("5.Search and find contacts");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            System.out.println();
            System.out.println();
            switch (choice) {
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    mobilePhone.input();
                    break;
                case 3:
                    mobilePhone.Update();
                    break;
                case 4:
                    mobilePhone.Remove();
                    break;
                case 5:
                    mobilePhone.Search();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong choice !!!!!!!!!!!!!!!!!!!!! ");
            }
        }while(choice!=6);
    }
}
