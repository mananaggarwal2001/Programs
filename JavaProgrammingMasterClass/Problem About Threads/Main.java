public class Main {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static void main(String[] args) {
       new thread1().start();
       new thread2().start();
    }

    private static class thread1 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 1: Has the Lock 1");
                try{
                    Thread.sleep(100);

                } catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 1 Was Waiting for the lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1 has both lock1 and lock 2");
                }

                System.out.println("Thread 1 releases lock 2");
            }
        }
    }

    private static class thread2 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 2 : Has the Lock 2");
                try{

                    Thread.sleep(100);

                } catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 2 Was Waiting for the Lock 1");
                synchronized (lock2){
                    System.out.println("Thread 2 has both lock1 and lock2");
                }
                System.out.println("Thread 2 releases the lock 1");
            }

            System.out.println("Thread 2 releases the lock 1 and Exiting ....... ");
        }
    }
}