class mynewthread extends Thread{
    mynewthread(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("This is the My new Thread 1 namely : " + this.getName());
            try {
                Thread.sleep(900); // This method will stop the movement of the Thread and then Start the Thread after the Sleeping time is over.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class mynewthread2 extends Thread{
    mynewthread2(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("This is the My new Thread 2 namely : " + this.getName());
        }
    }
}



public class ThreadMethods {
    public static void main(String[] args) {
        mynewthread mynewthread = new mynewthread("Manan's Thread (most Important)");
        mynewthread2 mynewthread2 = new mynewthread2("Manan Thread Secondary");
        mynewthread.setPriority(Thread.MAX_PRIORITY);
        mynewthread2.setPriority(Thread.MIN_PRIORITY);
        mynewthread.start();
        try{
            mynewthread.join(); // This method is used to tell that the after the job of first Thread is done the Job of the Second thread is started otherwise the second thread will not start until  the job of the first thread is not done.
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }finally {
            System.out.println("The job of the First Thread is done.");
        }
        mynewthread2.start();

    }
}
