import java.util.Scanner;

public class MultiplicationTableJenny1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= terms; i++) {
            for (int j = 1; j <= terms; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}


