public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        int digit1 = a % 10;
        int digit2 = b % 10;
        int digit3 = c % 10;

        if ((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)) {

            if (digit1==digit2||digit1==digit3) {

                return true;
            } else if(digit2==digit3||digit2==digit1) {
                return true;

            }else if(digit3==digit1||digit3==digit2){
                return true;
            }

        }
        return false;
    }
    public static boolean isValid(int a){
        if(a>=10&&a<=1000){
            return true;
        }
        return false;
    }
}
