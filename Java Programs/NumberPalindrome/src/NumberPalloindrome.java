public class NumberPalloindrome {
    public static boolean isPalindrome(int number){
        int reverse_number = 0,digit,change_number =number;
        while(number!=0){
            digit=number%10;
            reverse_number+=digit;
            number=number/10;
            if(number!=0) {
                reverse_number *= 10;
            }
        }

        if(change_number==reverse_number){
            return true;
        }else{
            return false;

        }
    }



    }

