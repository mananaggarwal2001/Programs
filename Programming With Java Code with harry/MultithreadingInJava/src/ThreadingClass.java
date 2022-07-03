class threadClass1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4000) {
            System.out.println("This is the threadClass1 which includes the run method");
            System.out.println("I am good with the 1st class which is the threadClass1");
            i++;
        }
    }
}

class threadclass2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4000) {
            System.out.println("This is the thread Class 2 ");
            System.out.println("I am Good with the thread 2 Class");
            i++;
        }
    }
}

public class ThreadingClass {
    public static void main(String[] args) {
            threadClass1 t1= new threadClass1();
            threadclass2 t2 = new threadclass2();
            t1.start(); // THis method is used to start the thread execution in this case the start function is used.
            t2.start(); // CPU will  allocate some time to the thread 1 and then thread 2.
    }
}

