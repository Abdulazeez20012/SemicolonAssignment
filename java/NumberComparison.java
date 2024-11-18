import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        double sum = num1 + num2;


        String result = (num1 > num2) ? "The first number (" + num1 + ") is greater." :
                       (num2 > num1) ? "The second number (" + num2 + ") is greater." :

      
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("result");


    }
}
