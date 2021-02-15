public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber=new ComplexNumber(1,1);
        complexNumber.add(complexNumber);
        complexNumber.subtract(complexNumber);

        System.out.println("Imaginary Part of the complex Number is " + complexNumber.getImaginary());
        System.out.println("Real Part of the complex Number is "+ complexNumber.getReal());
    }
}
