import java.util.Scanner;
   public class GuessAndWin1 {
  
	public static void main(String[] args);

        Scanner scanner = new Scanner(System.in);

    	 
            System.out.println("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            int numberOfTries = 0;
            
            if (userGuess == numberToGuess) {
	    System.out.println("Congratulations! You found the number in " + 	numberOfTries + " tries." +" you win ");
                
            } 
            else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again!");
            } 
            else {
                System.out.println("Too low, try again!");



}

                     




}