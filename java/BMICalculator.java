
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (in pounds): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        double weightInKg = weight * 0.453592;

        double heightInMeters = height * 0.0254;

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        System.out.println("BMI Category:");
        if (bmi < 18.5) {
            System.out.println("Underweight: BMI is below 18.5");
        } else if (bmi < 25) {
            System.out.println("Normal weight: BMI is 18.5-24.9");
        } else if (bmi < 30) {
            System.out.println("Overweight: BMI is 25-29.9");
        } else {
            System.out.println("Obese: BMI is 30 or higher");
        }
    }
}

