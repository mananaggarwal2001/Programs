import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        System.out.println("Enter the Number of Elements Which you want in the array");
        count=scanner.nextInt();
        int[] array=getarray(count);
        reverse(array);
    }
    public static int[] getarray(int number){
        int[] array=new int[number];
        System.out.println("Enter the " + number + " Elements");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("NonreversedArrayWas : "+ Arrays.toString(array));
        return array;
    }
    public static void reverse(int[] array){
        int i=0;
        int j=array.length-1;
        int temp=0;

        do{
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;

        }while(j>array.length/2-1 && i<array.length/2+1 );
        System.out.println("ReversedArrayWas : " + Arrays.toString(array));

    }
}
