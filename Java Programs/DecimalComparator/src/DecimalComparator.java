public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2){
        int temp1=(int)(number1*10);
        int temp2=(int)(number1*100);
        int temp3=(int)(number1*1000);
        int num1=(int)(number2*10);
        int num2=(int)(number2*100);
        int num3=(int)(number2*1000);
        if(temp1==num1)
        {
            if(temp2==num2){
                if(temp3==num3){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
