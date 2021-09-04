import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Branch> Banklist =new ArrayList<Branch>();
    private Branch branch=new Branch();
    private Scanner scanner=new Scanner(System.in);
    private String Branchname;
    public void inputdetails(){
        boolean Surity=true;
        while(Surity){
            branch.inputCustomer();
            Banklist.add(branch);
            System.out.print("Are you Sure Want to add More Branch: ");
            Surity=scanner.nextBoolean();
        }
    }
    public void display(){
        System.out.print("Enter the Branch Name which you Want to Search: ");
        Branchname=scanner.nextLine();
        if(branch.getBranch().equals(Branchname)){
            for(int i=0;i<branch.getDetails().size();i++){
                System.out.println("List of Customers: ");
                System.out.println(Banklist.get(i).getDetails().get(i).getCust_name());
            }
            scanner.nextLine();
        }

    }
}
