import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myintarray=new int[5];
        int[] AnotherIntarray=myintarray;
        System.out.println("MyIntArray = " + Arrays.toString(myintarray));
        System.out.println("AnotherIntarray " + Arrays.toString(AnotherIntarray));
        AnotherIntarray[0]=1;
        System.out.println("Modified MyIntArray = " + Arrays.toString(myintarray));
        System.out.println("Modified AnotherIntarray " + Arrays.toString(AnotherIntarray));
        modofiedarray(myintarray);
        System.out.println();
        System.out.println("MyIntArray = " + Arrays.toString(myintarray));
        System.out.println("AnotherIntarray " + Arrays.toString(AnotherIntarray));
        AnotherIntarray=new int[]{4,5,6,7,8};
        System.out.println();
        System.out.println("MyIntArray = " + Arrays.toString(myintarray));
        System.out.println("AnotherIntarray " + Arrays.toString(AnotherIntarray));


    }
    public static void modofiedarray(int[] array){
        array[0]=2;
        array=new int[]{1,2,3,4,5};//dereferencing the array in the method which will not be seen by the
                                    // modified array method as the modified array is pointing towards the original array.
    }
}
