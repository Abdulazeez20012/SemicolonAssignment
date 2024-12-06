import java.util.Scanner;

public class CreditCardValidator {

    public static boolean luhnCheck(String cardNumber) {
        int totalSum = 0;

   
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = cardNumber.charAt(i) - '0'; 

            if ((cardNumber.length() - i) % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;  
                }
            }
            totalSum += digit;
        }

        return totalSum % 10 == 0;
    }

    public static String cardType(String cardNumber) {
        if (cardNumber.charAt(0) == '4') {
            return "Visa";
        } else if (cardNumber.charAt(0) == '5') {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.charAt(0) == '6') {
            return "Discover";
        } else {
            return "Invalid Card";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter credit card number:");
        String cardNumber = scanner.nextLine();

        int cardLength = cardNumber.length();
        boolean valid = luhnCheck(cardNumber);  
        String cardType = cardType(cardNumber);  

      
        System.out.println("\nCredit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Digit Length: " + cardLength);
        System.out.println("Credit Card Validity Status: " + (valid ? "Valid" : "Invalid"));

       
    }
}
