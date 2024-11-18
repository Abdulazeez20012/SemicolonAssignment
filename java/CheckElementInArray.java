import java.util.Scanner;

public class CheckElementInArray {
    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

       
        System.out.println("Original Array:");
        printArray(array);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int targetElement = scanner.nextInt();

        
        if (checkElementInArray(array, targetElement)) {
            System.out.println("Element found in the array!");
        } else {
            System.out.println("Element not found in the array!");
        }
    }

    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    
    public static boolean checkElementInArray(int[] array, int targetElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                return true;
            }
        }
        return false; 
    }
}



