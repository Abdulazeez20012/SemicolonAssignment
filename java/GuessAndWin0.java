import java.util.Random;
import java.util.Scanner;

public class GuessAndWin0 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
       
       
        Scanner scan = new Scanner(System.in);

        int userGuess;
       
        

        
        while (userGuess!=numberToGuess) {
            
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scan.nextInt();
            

            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You found the number in ");
                break;
            } 
            
            else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again!");
            } 
            
            else {
                System.out.println("Too low, try again!");
            }
        }

      
    }
}
