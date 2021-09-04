public class FirstLastDigitSum {
    public static int SumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int firstdigit=0,sum=0;
        int lastdigit=0;
        lastdigit=number%10;
        while(number/10>0){
            number/=10;
        }
        firstdigit+=number;
        sum=firstdigit+lastdigit;
        System.out.println("first and last digit is " + firstdigit + "," + lastdigit);
        return sum;

    }
}
