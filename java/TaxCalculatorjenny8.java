import java.util.Scanner;

public class TaxCalculatorjenny8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] citizens = {"John", "Alice", "Bob"};
        double[] earnings = new double[citizens.length];

        for (int i = 0; i < citizens.length; i++) {
            System.out.print("Enter earnings for " + citizens[i] + ": ");
            earnings[i] = scanner.nextDouble();
        }

        for (int i = 0; i < citizens.length; i++) {
            double tax = calculateTax(earnings[i]);
            System.out.println(citizens[i] + "'s total tax: $" + String.format("%.2f", tax));
        }

        scanner.close();
    }

    public static double calculateTax(double earnings) {
        double taxRate = (earnings <= 30000) ? 0.15 : 0.20;
        double taxableAmount = (earnings <= 30000) ? earnings : 30000 + (earnings - 30000) * 0.20;
        return taxableAmount * taxRate;
    }
}


