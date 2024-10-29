import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter number (-1 to exit): ");
            int num = scanner.nextInt();

            if (num == -1) { 
                break;
            }

            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println(num + " is divisible by 5 and 11");
            } else {
                System.out.println(num + " is not divisible by 5 and 11");
            }
        }

      
    }
}
