import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arrayList = new String[n];
        for (int i = 0; i < n; i++) {
            arrayList[i] = scanner.nextLine();
        }
        for (String arrayStringWords : arrayList) {
            try {
                Pattern pattern = Pattern.compile(arrayStringWords);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
