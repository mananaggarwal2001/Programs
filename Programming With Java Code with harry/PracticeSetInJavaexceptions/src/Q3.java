import java.util.Scanner;

class Myexception extends Exception {
    @Override
    public String toString() {
        return "Max Retries Exceed";
    }

    @Override
    public String getMessage() {
        return "Max Retries Exceed";
    }
}


public class Q3 {

    public static void name() throws Myexception{
        int[] arr = new int[5];
        arr[0]= 12;
        arr[1]= 13;
        arr[2]= 14;
        arr[3]= 15;
        arr[4]= 20;
        int count=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            if(count >= 5){
                throw new Myexception();
            }
            try{
                System.out.print("Enter the value of the index in the array:- ");
                int index = sc.nextInt();
                System.out.println("The value of the given array in the index is :- " + arr[index]);
                break;
            }catch (Exception e){
                System.out.println("Invalid index passed Please try again !!!!!!!!!!!!!");
            }
            count++;
        }
    }
    public static void main(String[] args) {
        try{
            name();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
