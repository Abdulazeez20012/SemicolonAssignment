
import java.util.Scanner;

public class PizzaWahala {
    public static void main(String[] args) {
        int numberOfPeople, numberOfBoxes, leftoverSlices, totalPrice;
        int slicesPerBox = 0, pricePerBox = 0;
        String pizzaType;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        numberOfPeople = scanner.nextInt();

        System.out.print("Enter the type of pizza (Sapa size, Small Money, Big boys, Odogwu): ");
        pizzaType = scanner.nextLine();

        if (pizzaType.equalsIgnoreCase("Sapa size")) {
            slicesPerBox = 4;
            pricePerBox = 2500;
        } else if (pizzaType.equalsIgnoreCase("Small Money")) {
            slicesPerBox = 6;
            pricePerBox = 2900;
        } else if (pizzaType.equalsIgnoreCase("Big boys")) {
            slicesPerBox = 8;
            pricePerBox = 4000;
        } else if (pizzaType.equalsIgnoreCase("Odogwu")) {
            slicesPerBox = 12;
            pricePerBox = 5200;
        } else {
            System.out.println("Invalid pizza type entered!");
            return;
        }

        numberOfBoxes = (int) Math.ceil((double) numberOfPeople / slicesPerBox);

        int totalSlices = numberOfBoxes * slicesPerBox;
        leftoverSlices = totalSlices - numberOfPeople;

        totalPrice = numberOfBoxes * pricePerBox;

        System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
        System.out.println("Number of slices left over after serving = " + leftoverSlices + " slices");
        System.out.println("Price = " + totalPrice);

    }
}
