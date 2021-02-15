public class NumberToWords {
    public static void numberToWords(int number) {
        if(number<0){
            System.out.println("Invalid Value");
        }
        int count;
        int value=0;
        count=getDigitCount(number);

        number=reverse(number);

        do{
            value=number%10;
            if(value==0){
                System.out.println("Zero");
            }else
            {
                switch (value){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

            }
            number=number/10;
            count--;

        }while(value>=0&&count>0);



    }

    public static int reverse(int number) {
        int value, reversenumber = 0;

        while (number != 0) {

            value = number % 10;
            reversenumber += value;
            number = number / 10;

            if (number !=0) {

                reversenumber *= 10;
            }


        }
        return reversenumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;

        if(number==0){
            count=1;
        }

        while (number >0) {

            count++;
            number = number / 10;
        }
        return count;
    }
}





