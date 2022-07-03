class mythread1 extends Thread{
    public mythread1 (String name){
        super(name); // The Thread Class contain the name method which is used to give the name of the Particular thread.
    }
    public void run(){
        System.out.println("I am  a Thread of the First Thread");
    }
}

class myThread2 extends Thread{
    public myThread2 (String name){
        super(name);

    }

    @Override
    public void run() {
        System.out.println("I am the thread of the second Class Thread");
    }
}


public class ThreadClassUsingconstructor {
    public static void main(String[] args) {
        mythread1 mythread = new mythread1("Thread 1");
        myThread2 mythread2 = new myThread2("Thread 2");
        mythread2.start();
        mythread.start();
        System.out.println(mythread.getName());
        System.out.println(mythread2.getName());
    }
}
