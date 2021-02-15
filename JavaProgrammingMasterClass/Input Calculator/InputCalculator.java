import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner input=new Scanner(System.in);
        int sum=0;
        long x;
        int count=0;
        long average=0;
        float divide = 0;
        while(true){
            int order=count+1;
            System.out.println("Enter the number " + order + " : ");
            boolean value=input.hasNextInt();
            if(value){
                x=input.nextInt();
                count++;
                sum+=x;
                divide=sum/count;
                average= Math.round((divide));
                average+=1;

            }else{
                break;
            }

             input.nextLine();
        }
        System.out.println("SUM = "+ sum +" AVG = "+ average);
        input.close();
    }
}
