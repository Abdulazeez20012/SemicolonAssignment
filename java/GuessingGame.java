import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
       
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        
        Scanner scanner = new Scanner(System.in);

     
        int numberOfTries = 0;

       
        while (true) {
         
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            } 
            
            else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again!");
            } 
            
            else {
                System.out.println("Too low, try again!");
            }
        }

     
        scanner.close();
    }
}



