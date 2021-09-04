public class DIGIT_SUM_CHALLENGE {
    public static void main(String[] args) {
        System.out.println(sumDigits(188889));
    }
    public static int sumDigits(int number){
        int sum = 0;

        if(number<=10||number<0)
        {
            return -1;
        }
        while(number>0){
           int digit = number%10;
            sum=sum +digit;
            number/=10;
        }


        return sum;
    }
}
