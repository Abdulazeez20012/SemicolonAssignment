import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        String choice;

        do {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}



