public class SumOfArray {
    public static void main(String[] args) {
     
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

       
        System.out.println("Original Array:");
        printArray(array);

     
        System.out.println("Sum of Array Elements: " + sumOfArray(array));
    }

   
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

   
    public static int sumOfArray(int[] array) {
        int sum = 0; 
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; 
        }
        return sum;
    }
}


