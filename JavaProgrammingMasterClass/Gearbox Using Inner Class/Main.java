import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static Button button=new Button("Print");
    public static void main(String[] args) {
    button.setOnclickListener(new Button.OnclickListener() {    // declaration for anonymous class
        @Override
        public void Onclick(String title) {
            
        }
    });
    }
}
