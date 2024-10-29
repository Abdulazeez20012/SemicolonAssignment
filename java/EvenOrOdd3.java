import java.util.Scanner; 

public class EvenOrOdd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        while (true) { 
            System.out.print("Enter a number (-1 to exit): ");
            int num = scanner.nextInt(); 

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                System.out.println(num + " is even."); 
            } else {
                System.out.println(num + " is odd."); 
            }
        }


    }
}
