public class Main {
    public static void main(String[] args) {


        SimpleCalculator obj = new SimpleCalculator();
        obj.setFirstNumber(32);
        obj.setSecondNumber(64);
        double Add = obj.getAdditionResult();
        System.out.println("The addition result is" + Add);
        double sub = obj.getSubtrationResult();
        System.out.println("The Subtracted result is " + sub);
        double mul = obj.getMultiplicationResult();
        System.out.println("The multiplication result is " + mul);
        double div = obj.getDivisionResult();
        System.out.println("The Divided result is " + div);
    }
}
