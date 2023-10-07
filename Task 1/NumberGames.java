import java.util.Random;
import java.util.Scanner;

public class NumberGames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int guess = 0;
            int n = ran.nextInt(100) + 1;

            System.out.println("\t\tWelcome to the Number Guessing Game!");
            System.out.println("\nYou have to guess the number in 3 attempts...");

            for (int i = 0; i < 3; i++) {
                System.out.print("\n->Enter your guess within 1 and 100 : ");
                int g = sc.nextInt();
                guess++;

                if (g == n) {
                    System.out.println("\tCongratulations! You guessed the number correctly!");
                    break;
                } else if (g < n) {
                    System.out.println("Oops!! Your guess is too low...");
                } else {
                    System.out.println("Oops!!Your guess is too high...");
                }
            }

            if (guess == 3) {
                System.out.println("\n->You have used all your guesses. The correct number was: " + n);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String Response = sc.next().toLowerCase();
            System.out.println("\n____________________________________________________________________\n");

            if (!Response.equals("yes")) {
                playAgain = false;
            }
        }

        sc.close();
        System.out.println("Thankyou for playing the game.Hope you enjoyed it....");
    }
}
