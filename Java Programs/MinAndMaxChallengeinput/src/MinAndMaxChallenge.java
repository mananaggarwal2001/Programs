import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        int x,max=0,count=0;
                boolean check=true;
                int min=Integer.MAX_VALUE;
        Scanner input=new Scanner(System.in);
        while(true){
            int order=count+1;
            System.out.println("Enter the number "+order +":");
            boolean isiint=input.hasNextInt();
            if(isiint){
                x=input.nextInt();
                if(max<x){
                    max=x;
                }

                if(min>x){
                    min=x;
                }



                count++;

            }else{
                break;
            }


        }
        System.out.println("Max Number is :" + max);
        System.out.println("Min Number is :"+ min);


        input.close();
    }
}
