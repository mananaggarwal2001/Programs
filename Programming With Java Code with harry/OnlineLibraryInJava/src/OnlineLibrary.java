import java.util.ArrayList;
import java.util.List;

public class OnlineLibrary {
    private static final List<String> TotalBooks = new ArrayList<String>(100); // for setting the intial capcity for the total books.
    private static final List<String> issuedBooks = new ArrayList<String>(100); // for setting the intial capacity for the issued books.

    public void addBooks(String bookName) {
        if (TotalBooks.isEmpty()) {
            TotalBooks.add(bookName);
            System.out.println("The book namely " + bookName + " is added Successfully !!!!!!!!!!!!!");
        } else if (TotalBooks.size() == 100) {
            System.out.println("The Library is full and you can't add more books in this Library !!!!!!");
        } else {
            TotalBooks.add(bookName);
            System.out.println("The book namely " + bookName + " is added Successfully !!!!!!!!!!!!!");
        }
    }

    public void issueBooks(String bookName) {
        int i = 0;
        for (String element : TotalBooks) {
            if (element.equalsIgnoreCase(bookName)) {
                System.out.println("The removed Books is :- "+TotalBooks.remove(i));
                if(issuedBooks.isEmpty()) {
                    issuedBooks.add(bookName);
                }else{
                    issuedBooks.add(bookName);
                }

                break;
            }
            i++;

        }
    }
    public void returnBook(String bookname){
        int count=0;
        for(String element: issuedBooks){
            if(element.equalsIgnoreCase(bookname)){
                issuedBooks.remove(count);
                TotalBooks.add(bookname);
                break;
            }
            count++;
        }
    }
    public void displayAllTheAvailableBooks() {
        for (String element : issuedBooks) {
            System.out.println(element);
        }
    }

}
