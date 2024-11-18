import java.util.Scanner;
   public class GuessAndWin {  
	public static void main(String[] args);

        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 0;

       
      	  While (numberOfTries); {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt(43);
            

            if (userGuess == numberToGuess) {
	 System.out.println("Congratulations! You found the number in " + 	numberOfTries + " tries." +" you win ");
                
                break;
            } 
            else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again!");
            } 
            else {
                System.out.println("Too low, try again!");

                      numberOfTries++;
            }
        }

    }
}





}