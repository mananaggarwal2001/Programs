public class Customer implements Runnable{
    private double withDrawAmount;
    private double sendAmount;
    private BankAccount Account = new BankAccount(1000,"12345-678");

    public Customer(double withDrawAmount, double sendAmount) {
        this.withDrawAmount = withDrawAmount;
        this.sendAmount = sendAmount;
    }

    public void run(){
        Account.deposite(sendAmount);
        Account.withDraw(withDrawAmount);
    }
}
