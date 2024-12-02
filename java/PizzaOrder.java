import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();  


        System.out.print("Enter the pizza type (Sapa size, Small Money, Big boys, Odogwu): ");
        String pizzaType = scanner.nextLine().trim();


        int slicesPerBox = 0;
        int pricePerBox = 0;


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
            System.out.println("Invalid pizza type. Please choose a valid pizza type.");
            return;
        }


        int boxesNeeded = (int) Math.ceil((double) numberOfPeople / slicesPerBox);

        int totalSlices = boxesNeeded * slicesPerBox;
        int slicesLeft = totalSlices - numberOfPeople;


        int totalPrice = boxesNeeded * pricePerBox;

        System.out.println("Number of boxes of pizza to buy = " + boxesNeeded + " boxes");
        System.out.println("Number of slices left over after serving = " + slicesLeft + " slices");
        System.out.println("Total Price = " + totalPrice);
    }
}
