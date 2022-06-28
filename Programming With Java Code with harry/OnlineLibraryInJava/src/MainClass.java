import java.util.Scanner;

public class MainClass {
    private static final OnlineLibrary onlineLibrary = new OnlineLibrary();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add a Book in the Library");
            System.out.println("2. Show Available Book in the Library");
            System.out.println("3. Issue a Book in the Library ");
            System.out.println("4. Return the book in the library ");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println();
            System.out.print("Enter your choice :- ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter your book name which you want to add :- ");
                    String bookname = scanner.nextLine();
                    onlineLibrary.addBooks(bookname);
                    break;
                }
                case 2: {
                    System.out.println("The Books available in the library is :- ");
                    onlineLibrary.displayAllTheAvailableBooks();
                }
                case 3: {
                    System.out.print("Enter your book name which you want to issue:- ");
                    String bookname = scanner.nextLine();
                    scanner.nextLine();
                    onlineLibrary.issueBooks(bookname);
                    break;
                }
                case 4: {
                    System.out.print("Enter the book name which you want to return :- ");
                    String bookname = scanner.nextLine();
                    onlineLibrary.returnBook(bookname);
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    System.out.println("Sorry Wrong Choice Pls Try again ||||||||||| ");
                    break;
                }

            }
        } while (choice != 5);
    }
}
