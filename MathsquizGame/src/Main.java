import java.util.Random;
import java.util.Scanner;

public class MathsquizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctAnswers = 0;


        for (int i = 1; i <= 10; i++) {

            int number1 = random.nextInt(20) + 1;
            int number2 = random.nextInt(20) + 1;


            int operationChoice = random.nextInt(3);
            int correctAnswer = 0;
            String operationSymbol = "";


            if (operationChoice == 0) {
                correctAnswer = number1 + number2;
                operationSymbol = "+";
            } else if (operationChoice == 1) {
                correctAnswer = number1 - number2;
                operationSymbol = "-";
            } else if (operationChoice == 2) {
                correctAnswer = number1 * number2;
                operationSymbol = "*";
            }


            System.out.println("Question " + i + ": What is " + number1 + " " + operationSymbol + " " + num2 + "?");


            System.out.print("Your answer: ");
            int playerAnswer = scanner.nextInt();

            if (playerAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Wrong. The correct answer was: " + correctAnswer);
            }


        }

        System.out.println("You answered " + correctAnswers + " out of 5 questions correctly.");
    }
}
