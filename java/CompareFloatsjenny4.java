import java.util.Scanner;

public class CompareFloatsjenny4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second floating-point number: ");
        double num2 = scanner.nextDouble();

        if (Math.round(num1 * 1000) / 1000.0 == Math.round(num2 * 1000) / 1000.0) {
            System.out.println(num1 + " and " + num2 + " are the same up to three decimal places.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not the same up to three decimal places.");
        }

        scanner.close();
    }
}

