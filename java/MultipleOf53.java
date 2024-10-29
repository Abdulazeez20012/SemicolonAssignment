import java.util.Scanner; 

public class MultipleOf53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter a number (-1 to exit): ");

            int num = scanner.nextInt(); 

            if (num == -1) { 
                break;
            }

            if (num % 5 == 0) {
                System.out.println(num + " is a multiple of 5.");
            } else {
                System.out.println(num + " is not a multiple of 5."); 
            }
        }

    }
}
