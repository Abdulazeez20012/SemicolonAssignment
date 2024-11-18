public class ReverseArray {
    public static void main(String[] args) {
       
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        System.out.println("Original Array:");
        printArray(array);


        reverseArray(array);

       
        System.out.println("Reversed Array:");
        printArray(array);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void reverseArray(int[] array) {
        int left = 0; 
        int right = array.length - 1; 

        while (left < right) {
           
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}


