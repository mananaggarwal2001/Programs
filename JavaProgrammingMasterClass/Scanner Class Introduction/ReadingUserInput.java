import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        readinguserinput();

    }

    public static void readinguserinput() {
        Scanner input = new Scanner(System.in); // Scanner Class introduction
        int x = 0, count = 0, sum = 0;
        while(true){
            int order=count+1;
            System.out.println("Enter the number#" + order +":");
            boolean isint=input.hasNextInt();
            if(isint){
                x=input.nextInt();
                count++;
                sum+=x;
                if(count==10){
                    break;
                }
            }else{
                System.out.println("Invalid Value");
            }
            input.nextLine(); //has to free the next line so that to handle the input
                            // statements and continue inputting the values.


        }
        System.out.println("The sum of the 10 number is " + sum);
        input.close();

    }
}