class GoodMorningWelcome extends  Thread{
    GoodMorningWelcome(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<50000) {
            System.out.println("GoodMorning");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            i++;
        }
    }
}

class WelcomeClass extends Thread{
    WelcomeClass(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<50000) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200); // Using  the sleep methods we can delay the execution time for the thread.
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            i++;
        }
    }
}

public class ThreadProblems {
    public static void main(String[] args) {
            GoodMorningWelcome gd = new GoodMorningWelcome("Good Morning");
            gd.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The Priority of the GoodMorningWelcome State is :- " + gd.getPriority());
            WelcomeClass welcomeClass = new WelcomeClass("Welcome Sir");
            welcomeClass.setPriority(Thread.MIN_PRIORITY);
        System.out.println("The Priority of the Welcome Class is :- " + welcomeClass.getPriority());
            gd.start();
            welcomeClass.start();

    }
}
