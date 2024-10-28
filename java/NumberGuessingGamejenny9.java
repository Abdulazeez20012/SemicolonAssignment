import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGamejenny9 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 1-100
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100!");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low, try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Congratulations! You found the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}





