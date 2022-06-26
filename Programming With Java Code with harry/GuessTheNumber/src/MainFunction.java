public class MainFunction {
    public static void main(String[] args) {
        GuessTheNumber number = new GuessTheNumber();
        number.isCorrectNUmber();
        System.out.println("you have Guessed the number in " + number.getNo_Of_Guesses()+ " Choices ");
    }
}
