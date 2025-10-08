import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissor"};
        String playerchoice;
        String computerchoice;
        String playAgain = "yes";

        do {
            System.out.println("Enter your move(rock, Paper, Scissor)");
            playerchoice = sc.nextLine().toLowerCase();

            if (!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissor")) {
                System.out.println("Invalid choice");
            }


            computerchoice = choices[rand.nextInt(3)];
            System.out.println("computer choice:" + computerchoice);
            if (playerchoice.equals(computerchoice)) {
                System.out.println("Its a tie!");
            } else if (!playerchoice.equals("rock")&& !playerchoice.equals("paper") && !playerchoice.equals("scissor")) {
                System.out.println("Invalid choice");
                continue;
            }
                
             else if (playerchoice.equals("rock") && computerchoice.equals("paper") || playerchoice.equals("paper") && computerchoice.equals("scissor") || playerchoice.equals("scissor") && computerchoice.equals("rock")) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win");
            }
            System.out.println("Play again?(Yes/No)");
            playAgain = sc.nextLine().toLowerCase();


        }while (playAgain.equals("yes"));
        System.out.println("Good bye");
    }
}