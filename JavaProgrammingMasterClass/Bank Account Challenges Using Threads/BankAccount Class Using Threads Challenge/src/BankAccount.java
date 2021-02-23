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

        try{
            if(lock.tryLock(1,TimeUnit.SECONDS)){      // Timout is the Time Period of holding the lock and then release the lock
                try {
                    Balance += amount;
                } finally {
                    lock.unlock();
                }
            } else{
                System.out.println("Could't get The Lock");
            }

        } catch (InterruptedException e){
            e.printStackTrace();
        }


//        lock.lock();
//        try{
//            Balance += amount;
//            } finally {
//                lock.unlock();
//            }

    }
    public  void withDraw(double balance){

        try {

            if(lock.tryLock(1,TimeUnit.SECONDS)) {
                try {
                    Balance -= balance;
                } finally {
                    lock.unlock();
                }
            }else{
                System.out.println("Couldn't get the lock");
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){

            System.out.println("The Account Number is " + accountNumber);

    }
}
