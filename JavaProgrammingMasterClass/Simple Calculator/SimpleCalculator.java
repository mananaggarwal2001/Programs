public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }

    public void setSecondNumber(double secondnumber){
        this.secondNumber=secondnumber;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return getFirstNumber()+getSecondNumber();
    }
    public double getSubtrationResult(){
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber()*getSecondNumber();
    }
    public double getDivisionResult() {
        double validsecondnumber = secondNumber;
        if (validsecondnumber == 0) {
            return 0;
        } else {
            return getFirstNumber() / getSecondNumber();
        }
    }

}
