import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter credit card number:");
        String cardNumber = scanner.nextLine();

      
        int cardLength = cardNumber.length();
        int totalSum = 0;
        int digit;

        
        for (int i = cardLength - 1; i >= 0; i--) {
            digit = cardNumber.charAt(i) - '0';
            
           
            if ((cardLength - i) % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9; 
                }
            }
            totalSum += digit;
        }

        
        boolean valid = totalSum % 10 == 0;

       
        String cardType = "Invalid Card";
        if (cardNumber.charAt(0) == '4') {
            cardType = "Visa";
        } else if (cardNumber.charAt(0) == '5') {
            cardType = "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            cardType = "American Express";
        } else if (cardNumber.charAt(0) == '6') {
            cardType = "Discovery";
        }

      
        System.out.println("====================================================================");
        System.out.println("\nCredit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Digit Length: " + cardLength);
        System.out.println("Credit Card Validity Status: " + (valid ? "Valid" : "Invalid"));
        System.out.println("====================================================================");
    }
}
