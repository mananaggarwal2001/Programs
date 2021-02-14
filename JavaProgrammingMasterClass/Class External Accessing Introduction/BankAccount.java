import java.util.Scanner;

    public class BankAccount {
    private long accountnumber;
    private double balance;
    private String customer_name;
    private String email;
    private long Phoneno;

    public void setAccountnumber(long accountnumber){
        this.accountnumber=accountnumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCustomer_name(String customer_name){
        this.customer_name=customer_name;
    }
    public void setEmail(String Email){
        this.email=Email;
    }
    public void setPhoneno(long phoneno){
        this.Phoneno=phoneno;
    }
    public long getAccountnumber(){
        return this.accountnumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomer_name(){
        return this.customer_name;
    }
    public String getEmail(){
        return this.email;
    }
    public long getPhoneno(){
        return this.Phoneno;
    }
    public double deposite_funds(double cash){

      this.balance+=cash;
      return this.balance;
    }
    public double withdraw_funds(double withdrawcash){
        double balance=0;
        if(balance<getBalance()){
            System.out.println("Insufficient Funds");
        }else{
            this.balance-=withdrawcash;
            return this.balance;
        }
        return 0;
    }
}
