public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real,double imaginary){
        this.imaginary+=imaginary;
        this.real+=real;
    }
    public void add(ComplexNumber complexNumber){
     complexNumber.imaginary+=this.imaginary;
     complexNumber.real+=this.real;
    }
    public void subtract(double real,double imaginary){
        this.imaginary-=imaginary;
        this.real-=real;
    }
    public void subtract(ComplexNumber complexNumber){
        complexNumber.imaginary-=this.imaginary;
        complexNumber.real-=this.real;
    }
}
