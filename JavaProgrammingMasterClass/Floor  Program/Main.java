public class Main {
    public static void main(String[] args) {
        Carpet carpet=new Carpet(2.5);
        Floor floor=new Floor(2.5,9.0);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println("Total Cost is " + calculator.getTotalCost());
    }
}
