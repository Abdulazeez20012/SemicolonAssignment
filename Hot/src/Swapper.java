public class Swapper {
    public static void swap(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println(num1 + ", " + num2);
    }

    public static void main(String[] args) {
        swap(2, 4);
    }
}


