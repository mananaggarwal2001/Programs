import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int no_Of_Guesses;
    int computerNumberChoice;
    int count = 0;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    GuessTheNumber() { // The computer Number has been intialized.
        computerNumberChoice = random.nextInt(100);
    }

    public int getNo_Of_Guesses() {
        return no_Of_Guesses;
    }

    public void setNo_Of_Guesses(int no_Of_Guesses) {
        this.no_Of_Guesses = no_Of_Guesses;
    }

    public void isCorrectNUmber() {
        while (true) {
            int guessedNumber = scanner.nextInt();
            if (computerNumberChoice > guessedNumber) {
                System.out.println("The Number is Bigger than the guessed Number");
            } else if (computerNumberChoice < guessedNumber) {
                System.out.println("The Number is Smaller than the guessed Number");
            } else {
                break;
            }
            count++;


        }
        setNo_Of_Guesses(count);
    }
}
