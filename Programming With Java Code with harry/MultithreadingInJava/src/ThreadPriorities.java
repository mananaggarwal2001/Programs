class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    @Override
    public void run() {
        while(true) {  // Infinite While Loop.
            System.out.println("I am  the Thread Class using the Thread namely " + this.getName());
        }
    }
}


public class ThreadPriorities {
    public static void main(String[] args) {
            Mythread mythread1 = new Mythread("Manan (most Important Thread Should be run at the position 1)");
            Mythread mythread11 = new Mythread("Manan1");
            Mythread mythread12 = new Mythread("Ram");
            Mythread mythread13 = new Mythread("shekhar");
            Mythread mythread14 = new Mythread("Haya Bhusa");
            mythread1.setPriority(Thread.MAX_PRIORITY);
            mythread1.setPriority(Thread.MIN_PRIORITY);
            mythread11.setPriority(Thread.MIN_PRIORITY);
            mythread12.setPriority(Thread.MIN_PRIORITY);
            mythread13.setPriority(Thread.MIN_PRIORITY);
            mythread14.setPriority(Thread.MIN_PRIORITY);
            mythread1.start();
            mythread11.start();
            mythread12.start();
            mythread13.start();
            mythread14.start(); // for starting the working of the thread.

    }
}
