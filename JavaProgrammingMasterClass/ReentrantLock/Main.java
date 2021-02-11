package company;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final ReentrantLock lock = new ReentrantLock(true);
    public static void main(String[] args) {
    Thread t1 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), "Priority 10");
    Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLACK), "Priority 8");
    Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), "Priority 6");
    Thread t4 = new Thread(new Worker(ThreadColor.ANSI_YELLOW), "Priority 4");
    Thread t5 = new Thread(new Worker(ThreadColor.ANSI_CYAN), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);  // Priority is a Suggesstion to a Operating system
                            // priority Will depend on the timing of the Running code.
                            // Synchonrized block are't First come First Serve.
        t4.setPriority(4);
        t5.setPriority(2);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static class Worker implements Runnable {
        private int runcount =1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        public void run(){
            for(int i=0;i<100;i++) {
                lock.lock();
                try{
                    System.out.format(threadColor + "%s: runCount = %d\n ", Thread.currentThread().getName(), runcount++);
                    // execute Critical Section of Code.

                } finally {
                    lock.unlock();
                }

            }
        }
    }
}
