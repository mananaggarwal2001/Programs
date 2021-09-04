import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car porsche=new Car(); // intialization of the variable.
        Scanner input = new Scanner(System.in); // java predefined class.
        System.out.println("Model is "+ porsche.getModel());
        porsche.setModel("porsche");
        System.out.println("Model is " + porsche.getModel());
        input.close();
    }

}
