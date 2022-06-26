import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {


    public static Random random = new Random();
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Name of the User Who want to Play this game :- ");
        String user= scanner.next();
        if(user!=null) {
            int count = 0;
            int myScore = 0;
            int computerScore = 0;
            while (count != 5) {
                System.out.println("0 For rock ");
                System.out.println("1 For Paper");
                System.out.println("2 For Scissor");

                System.out.print("Enter your choice:- ");
                int mychoice = scanner.nextInt();
                int computerChoice = random.nextInt(3);
                System.out.println("My choice is :- " + mychoice);
                System.out.println("computer Choice is :- " + computerChoice);

                if ((mychoice == 0 && computerChoice == 2) || (mychoice == 1 && computerChoice == 0) || (mychoice == 2 && computerChoice == 1)) {
                    System.out.println("You Win !!!!!!");
                    myScore++;
                } else if (mychoice == 0 && computerChoice == 0 || mychoice == 1 && computerChoice == 1 || mychoice == 2 && computerChoice == 2) {
                    System.out.println("Draw !!!!!!");
                    count--;
                    continue;
                } else {
                    System.out.println("You Loose !!!!!!!!!!!!!");
                    computerScore++;
                }
                count++;
            }

            System.out.println();
            System.out.println();
            System.out.println("Result is :- ");
            System.out.println("Computer Score :- " + computerScore);
            System.out.println( user + " Score is :- "+ myScore);
            if (computerScore > myScore) {
                System.out.println("Computer Win !!!!!!!!!!!!!");

            } else if (myScore > computerScore) {
                System.out.println(user + " Win !!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }



    }
}
