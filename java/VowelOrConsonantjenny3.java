import java.util.Scanner;

public class VowelOrConsonantjenny3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a single character (a-z or A-Z): ");
            String input = scanner.next();

            if (input.length() != 1) {
                System.out.println("Error: Please enter a single character.");
            } else if (!Character.isLetter(input.charAt(0))) {
                System.out.println("Error: Please enter a letter (a-z or A-Z).");
            } else {
                char ch = input.charAt(0);
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
                break;
            }
        }

        scanner.close();
    }
}




