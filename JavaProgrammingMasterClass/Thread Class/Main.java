public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass("My Child Thread");
        threadClass.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("My Main number is :" + i);
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
    }
}
