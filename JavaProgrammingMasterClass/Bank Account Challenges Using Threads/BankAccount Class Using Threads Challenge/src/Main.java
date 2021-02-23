public class Main {
    public static void main(String[] args) {
        new Thread(new Customer(300,50)).start();
        new Thread(new Customer(100,203)).start();
    }
}
