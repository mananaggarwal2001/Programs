import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class MyExceptionClass extends Exception{
    @Override
    public String toString() {
        return " I Am ToString() Method";
    }

    @Override
    public String getMessage() {
        return " I Am ToMessage() Method";
    }

}
public class ExceptionClassInJava {
    public static void main(String[] args) {
        int a;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number which is less than nine");
         a= sc.nextInt();
         if(a<9){
             try {
                throw new MyExceptionClass();
             } catch (Exception e){
                 System.out.println(e.getMessage());
                 System.out.println(e.toString());
                 System.out.println(e); // only the ToString() method will run etc.
             }
         }
    }
}
