import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private ArrayList<Customer> details =new ArrayList<Customer>();
    private Customer customer=new Customer();
    private Scanner scanner=new Scanner(System.in);
    private String branch;
    public void inputCustomer(){
        boolean Surity=true;
        System.out.print("Enter the Branch name: ");
        branch=scanner.nextLine();
        while(Surity){
            customer.input();
            details.add(customer);
            System.out.print("Are you Sure want to add More Customers: ");
            Surity=scanner.nextBoolean();
        }
    }

    public ArrayList<Customer> getDetails() {
        return details;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getBranch() {
        return branch;
    }
}
