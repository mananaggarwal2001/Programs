import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String cust_name;
    private ArrayList<Double> transactions =new ArrayList<Double>();
    private double transaction;
    private Scanner scanner=new Scanner(System.in);
    public void input(){
        boolean Surity=true;
        int Count=1;
        System.out.print("Enter the name of customer");
        cust_name=scanner.nextLine();
        while(Surity){
            System.out.print(" Enter the "+(Count)+"."+" Transactions. ");
            transaction=scanner.nextDouble();
            transactions.add(transaction);
            System.out.print("Are you Sure Want to Add More transactions: ");
            Surity=scanner.nextBoolean();
            Count++;
            scanner.nextLine();
        }

    }
    public String getCust_name() {
        return cust_name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public double getTransaction() {
        return transaction;
    }

}
