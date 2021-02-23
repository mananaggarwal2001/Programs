import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double Balance;
    private String accountNumber;
    private ReentrantLock lock ;

    public BankAccount(double balance, String accountNumber) {
        Balance = balance;
        this.accountNumber = accountNumber;
        lock=new ReentrantLock();
    }

//    public synchronized void deposite(double amount){   // First method of Syncronizing
//        Balance+=amount;
//    }
//    public synchronized void withDraw(double balance){
//        Balance-=balance;
//    }


    public void deposite(double amount){

        boolean status = false;  // Status is a local variable as it make its own copies Each thread will get the unique status .
        try{
            if(lock.tryLock(1,TimeUnit.SECONDS)){      // Timout is the Time Period of holding the lock and then release the lock
                try {
                    Balance += amount;
                    status=true;
                } finally {
                    lock.unlock();
                }
            } else{
                System.out.println("Couldn't get The Lock");
            }

        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Transaction Status = " + status);


//        lock.lock();
//        try{
//            Balance += amount;
//            } finally {
//                lock.unlock();
//            }

    }
    public  void withDraw(double balance){

        boolean status = false;  // Status is a local variable as it make its own copies Each thread will get the unique status .
        try {

            if(lock.tryLock(1,TimeUnit.SECONDS)) {
                try {
                    Balance -= balance;
                    status=true;
                } finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Couldn't get the lock");
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Transaction Status is " + status);
    }



    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){

            System.out.println("The Account Number is " + accountNumber);

    }
}
