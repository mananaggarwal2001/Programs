public class FactorPrinter {
    public static void printFactors(int number){
        int divisior=0;
        for(int i=1;i<=number;i++){
            if (number%i==0){
                divisior=i;
                System.out.println(divisior+ "\r\r\n");
            }



        }

    }
}
