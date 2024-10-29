import java.util.Scanner;

public class Multipleof5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) { 
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();

            if (num % 5 == 0) {

                System.out.println(num + " is a multiple of 5");
            } 
		else {

                System.out.println(num + " is not a multiple of 5");
            }
        }

        scanner.close();
    }
}
