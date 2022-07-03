
class RunnableClass1 implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("This is the first runnable using the runnable Class 1 first");
        }

    }
}

class RunnableClass2 implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("This is the Thread for  the runnable Class 2 second");
        }
    }
}
public class ThreadingUsingRunnableInterface {

    public static void main(String[] args) {
        RunnableClass1 bullet1 = new RunnableClass1();
        Thread gun1= new Thread(bullet1);
        RunnableClass2 bullet2 = new RunnableClass2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
