import java.util.Scanner;

public class HugeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] number1 = new int[40];
        int[] number2 = new int[40];
        int[] sum = new int[40];
        int carry = 0;


        System.out.print("Enter first huge number : ");
        String num1 = input.nextLine();


        for (int i = 0; i < num1.length(); i++) {
            number1[39 - i] = num1.charAt(num1.length() - 1 - i) - '0';
        }


        System.out.print("Enter second huge number: ");
        String num2 = input.nextLine();


        for (int i = 0; i < num2.length(); i++) {
            number2[39 - i] = num2.charAt(num2.length() - 1 - i) - '0';
        }


        for (int i = 39; i >= 0; i--) {
            int sumDigits = number1[i] + number2[i] + carry;
            sum[i] = sumDigits % 10;
            carry = sumDigits / 10;
        }


        System.out.print("Sum: ");
        boolean leadingZero = true;


        for (int i = 0; i < 40; i++) {
            if (sum[i] != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                System.out.print(sum[i]);
            }
        }


        if (leadingZero) {
            System.out.print(0);
        }
        System.out.println();
    }
}
